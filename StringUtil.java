package com.qa.java.string;

public class StringUtil {

	static int countWords(String S) {
		/*
		 * // int count = 0; // String[]Str = S.split(" ")
		 */
		return S.split(" ").length; // CLEAN CODE to use the spaces

	}

	// METHOD to return number of invalid emails
	static int invalidEmails(String[] emails) {
		String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		int count = 0;

		for (String Email : emails) {
			if (!Email.matches(regex))
				count++;
		}
		return count;
	}

	// METHOD to return number of valid emails
	static int validEmails(String[] emails) {
		String regEx = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
		int count = 0;

		for (String Email : emails) {
			if (Email.matches(regEx))
				count++;
		}
		return count;
	}

	// METHOD to PRINT list of valid emails
	static void validEmailsConsole(String[] emails) {
		String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

		System.out.println("The valid emails are: ");
		for (String Email : emails) {
			if (Email.matches(regex))
				System.out.println(Email);
		}
	}

	// METHOD to PRINT list of valid emails
	static void invalidEmailsConsole(String[] emails) {
		String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

		System.out.println("The invalid emails are: ");
		for (String Email : emails) {
			if (!Email.matches(regex))
				System.out.println(Email);
		}

	}

}
