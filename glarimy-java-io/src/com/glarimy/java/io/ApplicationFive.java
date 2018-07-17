package com.glarimy.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ApplicationFive {

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee("Krishna", 100, true);
		employee.setId(123);
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("employee.gl"));
		os.writeObject(employee);
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("employee.gl"));
		Employee result = (Employee) is.readObject();
		System.out.println(result);
		is.close();
		os.close();
	}

}
