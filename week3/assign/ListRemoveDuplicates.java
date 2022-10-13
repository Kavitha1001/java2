package week3.assign;

import java.util.LinkedHashSet;
import java.util.Set;

public class ListRemoveDuplicates {

	public static void main(String[] args) {
		//Declare the string 

		String str="We learn java basics as part of java sessions in java week1";

		// Split the String

		String[] splt = str.split(" ");
		Set<String> Removedup =new LinkedHashSet<String>();
		//Loop through the condition
		for (int i = 0; i < splt.length; i++) 
		{
			boolean add=Removedup.add(splt[i]);

			if(add)
			{
				System.out.print(splt[i]+" ");
			}
		}

	}

}
