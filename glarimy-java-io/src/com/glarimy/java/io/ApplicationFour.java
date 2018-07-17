package com.glarimy.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ApplicationFour {

	public static void main(String[] args) throws Exception {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(new File("apple.jpg"));
			os = new FileOutputStream(new File("copy.jpg"));
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}

}
