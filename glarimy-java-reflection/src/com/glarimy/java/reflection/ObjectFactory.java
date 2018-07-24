package com.glarimy.java.reflection;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ObjectFactory {
	public static Object get(String key) throws Exception {
		Properties properties = new Properties();
		properties.load(new FileReader("configuration.properties"));
		String className = properties.getProperty(key);
		Class claz = Class.forName(className);
		Object o;
		try {
			o = claz.newInstance();
		} catch (IllegalAccessException eae) {
			Method method = claz.getMethod("getInstance");
			o = method.invoke(claz);
		}

		Method[] methods = claz.getDeclaredMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith("set")) {
				Class type = method.getParameterTypes()[0];
				Object dependency = get(type.getSimpleName().toLowerCase());
				Method setter = claz.getMethod(methodName, type);
				setter.invoke(o, dependency);
			}
		}
		return o;
	}
}
