package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Declare String 
		String name ="development";

		//Change String in to Character Array

		char[] chr= name.toCharArray();
		//Loop through the condition

		for (int i = 0; i < chr.length; i++) 
		{
			//check the condition for odd index

			if(i%2!=0)
			{
				//convert the odd index character and print 

				System.out.print(Character.toUpperCase(chr[i]));
			} 
			else 
			{
				System.out.print(chr[i]);
			}

		}

	}

}
