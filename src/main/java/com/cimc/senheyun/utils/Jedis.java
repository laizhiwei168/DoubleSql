package com.cimc.senheyun.utils;

import java.util.HashMap;
import java.util.Map;

public class Jedis {
	
	private static Map<String, String> JedisMap=new HashMap<String, String>();
	
	public static String get(String key) {
		return JedisMap.get(key);
	}
	
	public static String set(String key ,String value) {
		return JedisMap.put(key, value);
	}

}
