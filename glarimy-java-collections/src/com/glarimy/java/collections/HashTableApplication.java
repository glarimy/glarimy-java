package com.glarimy.java.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApplication {

	public static void main(String[] args) {
		Map<String, Object> bio = new Hashtable<>();
		bio.put("name", "Glarimy");
		bio.put("city", "Bengaluru");
		bio.put("year", 2008);

		System.out.println("Number of entries: " + bio.size());
		System.out.println("Keys: " + bio.keySet());
		System.out.println("Values: " + bio.values());
		System.out.println("Contains the key 'year'?:" + bio.containsKey("year"));
		System.out.println("Contains the value 'Bengaluru'?" + bio.containsValue("Bengaluru"));
		System.out.println("Year: " + bio.get("year"));
		System.out.println("Phone Number: " + bio.getOrDefault("phone", 9731423166L));
		System.out.println("Email: " + bio.get("email"));
	}
}