package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		// Declare a string as radar

		String str="radar";

		// Assign the string rev for reversing the string

		String rev="";

		// Convert string to Character Array

		char[] str1=str.toCharArray();
		// Loop through the condition

		for (int i = str1.length-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
		//compare the str and rev String are equals

		if (str.equals(rev))
		{ 
			System.out.println("Palindrome");
		} else
		{
			System.out.println("not palindrome");
		}

	}

}
