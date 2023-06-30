package com.collections;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map=Map.of("A",3,"B",4,"C",6);
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue(4));
		System.out.println(map.size());
		System.out.println(map.values());
		System.out.println(map.keySet());
		for(String m:map.keySet())
		{
			System.out.println(map.get(m));
		}
		
		
		
		//HashSet
		Map<String,Integer> ma=new HashMap<>(map);
		ma.put("s", 90);
		System.out.println(ma);
		System.out.println(ma.remove("A"));
		System.out.println(ma);
		
		
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("G",14 );
		hm.put("AB",140 );
		hm.put("E",14 );
		hm.put("Z",14 );
		System.out.println(hm);
		
		
		LinkedHashMap<String,Integer> lm=new LinkedHashMap<>();
		lm.put("G",14 );
		lm.put("AB",140 );
		lm.put("E",14 );
		lm.put("Z",14 );
		System.out.println(lm);
		
		
		TreeMap<String,Integer> tm=new TreeMap<>();
		tm.put("G",14 );
		tm.put("AB",140 );
		tm.put("E",14 );
		tm.put("Z",14 );
		System.out.println(tm);
		
		
	}

}
