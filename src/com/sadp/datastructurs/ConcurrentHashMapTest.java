package com.sadp.datastructurs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.run();

		Map conMap = new ConcurrentHashMap<>();
		conMap.put("1", "1");
		conMap.put("2", "1");
		conMap.put("3", "1");
		Iterator<String> itr = conMap.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key);
			if (key.equals("2")) {
				conMap.put(key + "new", "123");
			}

		}

	}

}
