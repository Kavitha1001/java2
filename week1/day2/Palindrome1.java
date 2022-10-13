package week1.day2;

public class Palindrome1 {

	 static boolean isPalindrome(String s) {
		 s="1332";
		
		int i=0,j=s.length()-1;
		
		while(i>j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		
			
		}
		return true;
	}
 
}
