package week2.day1;

import java.util.Arrays;

public class FindDuplicateElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {1,6,7,8,8,1};
		Arrays.sort(a);
		for(int i=0 ;i < a.length;i++) {
		
		if(a[i] ==a[i+1]) {
		   System.out.println(a[i]);
		}
		else
			System.out.println(a[i+1]);
		}

	}

}
