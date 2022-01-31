package org.howard.edu.lsp.hw2;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author ujjwaladhikari
 *
 */
public class Tokenize {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * a is a Boolean that allows to loop infinitely until changed to false
		 * scanner reads the input from user
		 * tokens stores the input into array by splitting in the space. 
		 * sum stores the sum of every elements in the tokens array
		 * product stores the product of every elements in the tokens array
		 */
		Boolean a = true;
		while (a) {
			System.out.println("String?");
			Scanner scanner = new Scanner(System.in);
			String[] tokens = scanner.nextLine().split(" ");
//			System.out.println(Arrays.asList(tokens));
			if (tokens[0].equals("Goodbye")){
				a = false;
			}
			else {
				System.out.println("Tokens:");
				int sum = 0;
				int product = 1;
				for (int i = 0; i < tokens.length; i++) {
					sum += Integer.parseInt(tokens[i]);
					product *= Integer.parseInt(tokens[i]);
					System.out.println(tokens[i]);
				}
				System.out.println("Sum: "+sum);
				System.out.println("Product: "+product+"\n");
			}
		}

	}

}
