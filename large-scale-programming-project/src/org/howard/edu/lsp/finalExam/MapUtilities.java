package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map; 
/**
 * 
 * @author ujjwaladhikari
 *
 */
public class MapUtilities { 
	/**
	 * 
	 * @param map1
	 * @param map2
	 * @return the count of the common key/value pair of the two given hashmap
	 * @throws NullMapException if either of the hashmap is null.
	 */
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) throws NullMapException {
		int count = 0;
		//checks if anyone of the hashmap is null
		if (map1 == null || map2 == null){
			throw new NullMapException();
		}
		//checks if anyone of the hashmap is empty
		if (map1.isEmpty() || map2.isEmpty()) {
//			System.out.print("Empty");
			return count;
		}
		
		for (Map.Entry<String, String> set: map1.entrySet()) {
			if (map2.containsKey(set.getKey())) {
				if (set.getValue().equals(map2.get(set.getKey()))) {
//					System.out.println(set.getKey()+"="+set.getValue());
					count+=1;
				}
			}
		}
		return count;
	}
}
