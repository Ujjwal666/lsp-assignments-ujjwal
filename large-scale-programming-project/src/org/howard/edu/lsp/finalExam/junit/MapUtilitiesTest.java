package org.howard.edu.lsp.finalExam.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.howard.edu.lsp.finalExam.MapUtilities;
import org.howard.edu.lsp.finalExam.NullMapException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapUtilitiesTest {
	@Test
	@DisplayName("Test cases for counting the common key/value pairs ")
	public void testcommonKeyValuePairs() throws NullMapException {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<>();

		map1.put("Alice","Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		 
//		HashMap<String, String> map0 = null;

//		map0.put(null,null);
		//map 2 has 4 keys
		HashMap<String, String> map2 = new HashMap<>();
		 
		map2.put("Mary", "Ecastic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Superb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
		
		HashMap<String, String> map3 = new HashMap<>();
		HashMap<String, String> map4 = new HashMap<>();
		
		HashMap<String, String> map5 = new HashMap<>();
		map5.put("Alice", "Healthy");
		map5.put("Ujjwal", "Fit");
//		System.out.print(MapUtilities.commonKeyValuePairs(map1,map2));
//		System.out.print(MapUtilities.commonKeyValuePairs(map1,map0));
		assertEquals("error in commonKeyValuePairs",MapUtilities.commonKeyValuePairs(map1,map2),2);
//		checks for single Empty hashmap
		assertEquals("error in commonKeyValuePairs",MapUtilities.commonKeyValuePairs(map1,map3),0);
//		checks for both Empty hashmap
		assertEquals("error in commonKeyValuePairs",MapUtilities.commonKeyValuePairs(map3,map4),0);
//		check for hashmap of different size
		assertEquals("error in commonKeyValuePairs",MapUtilities.commonKeyValuePairs(map1,map5),1);
		assertEquals("error in commonKeyValuePairs",MapUtilities.commonKeyValuePairs(map5,map1),1);
		
	}
	
	@Test
	@DisplayName("testcommonKeyValuePairs throws exception")
	public void testcommonKeyValuePairs_THROWS_EXCEPTION() {
		HashMap<String, String> map1 = null;
		HashMap<String,String> map2 = null;
		HashMap<String, String> map3 = new HashMap<>();
		map3.put("FCB", "Messi");
//		checks when both the hashmap is null.
		Exception exception1 = assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(map1,map2);
		});
		String expectedMessage = "One or both maps are null!";
		String actualMessage = exception1.getMessage();
		//checks when one hashmap is null
		Exception exception2 = assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(map1,map2);
		});
		String expectedMsg = "One or both maps are null!";
		String actualMsg = exception2.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
		assertTrue(actualMsg.contains(expectedMsg));
	}

}
