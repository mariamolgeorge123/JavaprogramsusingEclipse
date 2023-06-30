package com.collections;
import java.util.TreeMap;
public class TreemapFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tm=new TreeMap<>();
		tm.put("Z",2);
		tm.put("A",70);
		tm.put("G",1);
		tm.put("F",9);
		tm.put("Y",3);
		tm.put("N",2);
		System.out.println(tm);
		System.out.println(tm.lowerKey("F"));
		System.out.println(tm.floorKey("F"));
		System.out.println(tm.ceilingKey("F"));
		System.out.println(tm.higherKey("F"));
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.subMap("A","Y"));
		System.out.println(tm.subMap("A",true,"Y",true));
				

	}

}
