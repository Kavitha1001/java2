package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {

		int[] dupvalue = {1,3,76,98,67,99,67,1,3};

		Arrays.sort(dupvalue);


		for(int i=0;i< dupvalue.length-1;i++)
		{
			
			if(dupvalue[i] == dupvalue[i+1]);
			{ 
				System.out.println("the duplicate value is " + dupvalue[i]);

			}
		}


	}



}


