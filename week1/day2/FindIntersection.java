package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {

		// Declare an two Arrays

		int[] a1= {3,2,11,4,6,7};
		int[] a2= {1,2,8,4,9,7};

		//Loop through the Condition for first array

		for (int i = 0; i <=a1.length-1; i++) {

			for (int j = 0; j <=a2.length-1; j++) {

				// check the condition for comparing the both arrays

				if(a1[i]==a2[j])
				{
					System.out.print(a1[i]+" ");


				}

			}

		}



	}

}
