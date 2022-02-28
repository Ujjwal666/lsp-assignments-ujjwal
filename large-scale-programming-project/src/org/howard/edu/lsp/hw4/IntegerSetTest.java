package org.howard.edu.lsp.hw4;
import java.util.*;
import org.howard.edu.lsp.hw4.*;

/**
 * Tests the functionality of IntegerSet class
 * @author ujjwaladhikari
 *
 */
public class IntegerSetTest {
	/**
	 * 
	 * @param args N/A
	 * @throws IntegerSetException if set is empty
	 */
	public static void main(String[] args) throws IntegerSetException {
		//initializes the set1
		IntegerSet set1 = new IntegerSet();
		
		//adds the value to the set1
		set1.add(1);
		set1.add(2);
		set1.add(3);
		//String representation of set1
		System.out.println("Value of Set1 is:"+set1.toString());
		//returns smallest value of set1
		System.out.println("Smallest value of Set1 is:"+set1.smallest());
		//returns largest value of set1
		System.out.println("Largest value of Set1 is:"+set1.largest());
		
		//initializes the set2
		IntegerSet set2 = new IntegerSet();
		//adds the value to the set2
		set2.add(4);
		set2.add(5);
		set2.add(3);
		
		//String representation of set2
		System.out.println("Value of Set2 is:"+set2.toString());
		//union of set1 and set2
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2:"+set1.toString());
		//intersection of set1 and set2
		set1.intersect(set2);
		System.out.println("Result of intersection of Set1 and Set2:"+set1.toString());
		//difference of set1 and set2
		set1.diff(set2);
		System.out.println("Result of difference of Set1 and Set2:"+set1.toString());
		//checks if set is empty
		System.out.println(set1.isEmpty());
		
		//Throws the IntegerSetException
		//System.out.println(set1.largest());
		//Throws the IntegerSetException
		//System.out.println(set1.smallest());

		//adds 6 to set1
		set1.add(6);
		System.out.println("Value of Set1 is:"+set1.toString());
		//checks if set1 contains 6
		System.out.println(set1.contains(6));
		//removes 6 from set1
		set1.remove(6);
		//checks if set1 contains 6
		System.out.println(set1.contains(6));
		System.out.println("Value of Set1 is:"+set1.toString());
		//adds value to set1
		set1.add(9);
		set1.add(10);
		System.out.println("Value of Set1 is:"+set1.toString());
		//clears set1
		set1.clear();
//		throws error as the set is empty.
//		set1.remove(6);
		System.out.println("Value of Set1 is:"+set1.toString());
		//adds value in set1
		set1.add(4);
//		Adds just one 4
		set1.add(4);
		set1.add(3);
		set1.add(5);
//		does nothing as 6 it is not present in set1
		set1.remove(6);
		System.out.println("Value of Set1 is:"+set1.toString());
		System.out.println("Value of Set2 is:"+set2.toString());
		//checks if set1 equals to set2
		System.out.println(set1.equals(set2));
		//removes  4 from set2
		set2.remove(4);
		//checks if set1 equals to set2
		System.out.println(set1.equals(set2));
		//returns the length of set1
		System.out.println(set1.length());
	}

}
