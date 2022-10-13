package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		//Declare the string 

		String str="We learn java basics as part of java sessions in java week1";
		
		// Split the String

		String[] splt = str.split(" ");
		//Declare count variable
		int count=0;
       //Loop through the condition
		
		for (int i = 0; i < splt.length; i++) 

		{

			for (int j = i+1; j < splt.length; j++) 
			{
				// compare the two strings by using equals
				if(splt[i].equalsIgnoreCase(splt[j]))
				{
					splt[j]="";
					count++;

				}
			}
		}
		
		if(count>1) 
		{
			for (int k = 0; k < splt.length; k++) 
			{
				System.out.print(splt[k]+" ");
			}
		}

	}

}






