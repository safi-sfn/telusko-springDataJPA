package com.inxod.utils;

import java.util.UUID;

public class CustomIDGenerator {

	public static String generateId() {
		
		String objId = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
		
		return objId;
	}
}
