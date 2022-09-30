package com.qa.java.string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String();
		System.out.println(str1);
		String str2 = new String("abcd");
		System.out.println(str2);
		String str3 = new String("abcd");
		System.out.println(str3);
		System.out.println(str2 == str3); // Checking the address of the value
		// char ch 'a'; // 97 ASCII code

		System.out.println(str2.charAt(2));
		System.out.println(str2.compareTo("axyh")); // UNICODE Difference
		System.out.println(str2.compareToIgnoreCase("aBcD"));
		System.out.println(str2.concat(" Hello"));
		if (str2.equals(str3))
			System.out.println(true);

		System.out.println(str2.replace('a', 'A'));
		System.out.println(str2.length());
		String str5 = new String("Hello,How,Are,you");
		String[] strs = str5.split(",");
		for (String s : strs) {
			System.out.println(s);
		}

		String subString = str2.substring(2);
		System.out.println(subString);

		char[] chs = str2.toCharArray();
		for (char ch : chs) {
			System.out.println(ch);
		}

		System.out.println(str2.toUpperCase());
		String username = new String("   abcd      ");
		if (username.trim().equals("abcd"))
			System.out.println("Login success");
		else
			System.out.println("invalid username");

		System.out.println(String.valueOf(true));
		int salary = 242323;
		System.out.println(String.valueOf(salary));

		String password = "abcd"; // String literal
		String password1 = "abcd"; // dupliate literal , no new object gets created
		System.out.println(password == password1);
		System.out.println(password.equals(password1));

		// Call method from StringUtil - CONSOLE number of words in STRING
		int numberOfWords = StringUtil.countWords("hello how are you");
		System.out.println("Number of words in the given STRING is: " + numberOfWords);

		String[] emails = { "abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com",
				"1234@#$@gmail.com" };

		// Call method from StringUtil - CONSOLE number of invalid emails
		int invalidEmails = StringUtil.invalidEmails(emails);
		System.out.println("Number of invalid emails are: " + invalidEmails);

		// Call method from StringUtil - CONSOLE number of valid emails
		int validEmails = StringUtil.validEmails(emails);
		System.out.println("Number of invalid emails are: " + validEmails);

		// Call method from StringUtil - CONSOLE list valid emails
		StringUtil.validEmailsConsole(emails);

		// Call method from StringUtil - CONSOLE list invalid emails
		StringUtil.invalidEmailsConsole(emails);
	}
}
