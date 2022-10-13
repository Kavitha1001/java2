package week1.day2;

public class ReverseString {

	public static void main(String[] args) {

		String s1="Google";
		char[] chr =s1.toCharArray();
		for (int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(chr[i]);
		}

	}

}
