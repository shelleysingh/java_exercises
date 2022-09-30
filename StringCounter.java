package com.qa.java.string;

//Convert a String to Character Array
//toCharArray() Method

public class StringCounter {

	// METHOD
	public static void main(String args[]) {
		// USER INPUT "string"
		String str = "hello how are you";

		// CREATE & STORE array
		// RETURN toCharArray() method
		char[] ch = str.toCharArray();

		// PRINT the array elements
		for (char c : ch) {
			System.out.println(c);
		}
	}
}
