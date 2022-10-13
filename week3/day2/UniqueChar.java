package week3.day2;


import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		String name="google";
		char[] ch=name.toCharArray();
		Set<Character> duplicate=new HashSet<Character>();
	
		for (int i = 0; i < ch.length; i++) {

			
			boolean add=duplicate.add(ch[i]);
			if(add)
				System.out.print(ch[i]);
		}

			

	}

	}
