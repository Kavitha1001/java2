package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Declare String and assigned a text

		String str= "I am a software tester";

		//Split the Text
		String[] splt=str.split(" ");

		//Loop through the condition

		for (int i = 0; i < splt.length; i++)
		{
			if (i%2 != 0) 
			{
				// change the even index string to character

				char[] chr= splt[i].toCharArray();
				for (int j = chr.length-1; j >= 0; j--) 
				{
					System.out.print(chr[j]);
				}

			}else
			{

				System.out.print(" "+splt[i]+" ");

			}
		}

	}
}
