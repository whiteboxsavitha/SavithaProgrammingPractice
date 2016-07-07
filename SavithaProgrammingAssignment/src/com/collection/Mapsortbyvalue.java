package com.collection;
	
	import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
	 

public class Mapsortbyvalue {
		public static void main(String[] args){
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map.put("savi", 10);
			map.put("raj", 30);
			map.put("nish", 50);
			map.put("cheth", 40);
			map.put("ragh", 20);
			System.out.println(map);
	 
			@SuppressWarnings("unchecked")
			TreeMap<String, Integer> sortedMap = (TreeMap<String, Integer>) sortByValue(map);  
			System.out.println(sortedMap);
		}
	 

		@SuppressWarnings("unchecked")
		public static Map sortByValue(Map unsortedMap) {
			@SuppressWarnings("unchecked")
			Map sortedMap = new TreeMap(new ValueComparator(unsortedMap));
			sortedMap.putAll(unsortedMap);
			return sortedMap;
		}
	 
	}
	 
	class ValueComparator implements Comparator {
	 
		Map map;
	 
		public ValueComparator(Map map) {
			this.map = map;
		}
	 
		@SuppressWarnings("unchecked")
		public int compare(Object keyA, Object keyB) {
			@SuppressWarnings("rawtypes")
			Comparable valueA = (Comparable) map.get(keyA);
			@SuppressWarnings("rawtypes")
			Comparable valueB = (Comparable) map.get(keyB);
			return valueB.compareTo(valueA);
		}
	}
