package org.howard.edu.lsp.hw4;

import java.util.*;
/**
 * 
 * Handles the error exception in IntegerSet class
 * @author ujjwaladhikari
 *
 */
class IntegerSetException extends Exception{
	
}
 
public class IntegerSet {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set= new ArrayList<Integer>();
	
	// Default Constructor
	
	public IntegerSet(){
		
	};
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	/**
	 * Returns the length of the set
	 * @return
	 */
	public int length() {
		return set.size();
	};
	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * @param b
	 * @return
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> a=(ArrayList<Integer>) b.set;
		if (set.size() != a.size()){
			return false;
		}
		for (int i = 0; i < a.size(); i++) {
			if (set.contains(a.get(i))) {	
			}else{
				return false;
			};
		};
		return true;	
	};
	/**
	 * Returns true if the set contains the value, otherwise false
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
	 * @return
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException{
		if (length() == 0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		};
		int max_value = 0;
		for (int i = 0; i < length(); i++) {
			if (set.get(i) > max_value) {
				max_value = set.get(i);
			};
		};
		return max_value;
	};
	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * @return
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException{
		if (length() == 0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		};
		int min_value = set.get(0);
		for (int i = 1; i < length(); i++) {
			if (set.get(i) < min_value) {
				min_value = set.get(i);
			};
		};
		return min_value;
	};
	/**
	 * Adds an item to the set or does nothing it already there
	 * @param item
	 */
	public void add(int item) {
		if (set.contains(item)) {
			return;
		}
		else {
			set.add(item);
		};
	};
	/**
	 * Removes an item from the set or does nothing if not there and throws  a IntegerSetException error if set is empty
	 * @param item
	 * @throws IntegerSetException
	 */
	public void remove(int item) throws IntegerSetException{
		if (length() == 0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		};
		if ((length() > 0) & (set.contains(item))){
			set.remove(Integer.valueOf(item));
		};
	};
	/**
	 * unions two set (Set Union)
	 * @param intSetb
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> b=(ArrayList<Integer>) intSetb.set;
		for (int i = 0;i<b.size();i++) {
			if (set.contains(b.get(i))) {
			}else {
				set.add(b.get(i));
			}
		}
	};
	/**
	 * intersects two set
	 * @param intSetb
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> b=(ArrayList<Integer>) intSetb.set;
		set.retainAll(b);
	};
	/**
	 * difference of two set
	 * @param intSetb
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> b=(ArrayList<Integer>) intSetb.set;
		set.removeAll(b);
	};
	/**
	 * Returns true if the set is empty, false otherwise
	 * @return
	 */
	public boolean isEmpty() {
		return set.isEmpty();
	};
	/**
	 * Return String representation of your set
	 */
	public String toString() {
		String setString = "";
		for (int i=0;i<length();i++) {
			setString += Integer.toString(set.get(i));
		}
		return setString;
	};
};