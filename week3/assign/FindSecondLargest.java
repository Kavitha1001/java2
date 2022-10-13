package week3.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {


		// Here is the input
		int[] data = {3,2,11,4,6,7};
		List<Integer> lst=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			lst.add(data[i]);

		}
       System.out.println(lst);
		//1) Arrange the array in ascending order
		Collections.sort(lst);
		System.out.println(lst);

		//2) Pick the 2nd element from the last and print it
		int size=lst.size();
		System.out.println(lst.get(size-2));

	}

}
