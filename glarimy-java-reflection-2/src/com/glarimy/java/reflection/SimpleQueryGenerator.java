package com.glarimy.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SimpleQueryGenerator {
	public String getSaveQuery(Object entity) throws Exception {
		Class claz = entity.getClass();
		String tableName = claz.getSimpleName();
		String fieldsPart = "";
		String valuesPart = "";
		Field[] fields = claz.getDeclaredFields();
		for (Field field : fields) {
			String fieldName = field.getName();
			fieldsPart += fieldName.toUpperCase() + ",";
			String getterName = "get" + fieldName.substring(0, 1).toUpperCase()
					+ fieldName.substring(1, fieldName.length());
			Method getter = claz.getMethod(getterName);
			Object value = getter.invoke(entity);
			if (field.getType() == String.class)
				valuesPart += "'" + value + "',";
			else
				valuesPart += value + ",";
		}
		fieldsPart = fieldsPart.substring(0, fieldsPart.length() - 1);
		valuesPart = valuesPart.substring(0, valuesPart.length() - 1);
		String query = "insert into " + tableName + " (" + fieldsPart + ") values ( " + valuesPart + ")";
		return query;
	}
}
