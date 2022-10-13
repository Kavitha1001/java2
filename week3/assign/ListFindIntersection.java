package week3.assign;

import java.util.ArrayList;
import java.util.List;

public class ListFindIntersection {

	public static void main(String[] args) {

		// Declare An array for {3,2,11,4,6,7}
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(3);
		lst.add(2);
		lst.add(11);
		lst.add(4);
		lst.add(6);
		lst.add(7);
		//Declare another array for {1,2,8,4,9,7};
		List<Integer> lst1=new ArrayList<Integer>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(8);
		lst1.add(4);
		lst1.add(9);
		lst1.add(7);
		//Declare for loop iterator from 0 to array length
		List<Integer> lst2= new ArrayList<Integer>();
		for (int i = 0; i < lst.size(); i++) {
			int value=lst.get(i);
			//Declare a nested for another array from 0 to array length
			for (int j = 0; j < lst1.size(); j++) {
				int value1=lst1.get(j);
				// Compare Both the arrays using a condition statement	
				if(value==value1)
				{
					System.out.println(value1);
					lst2.add(value1);
				}


			}
			
		}
		System.out.println("The Intersected values are; "+ lst2);
	}

}

