package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		int n;
		int k=10;
	
		System.out.println(i);
		System.out.println(j);
		for(int m=1;m<k;m++)
		{
			n = i+j;
			i=j;
			j=n;
			System.out.println(n);
		
		}
	}
	
}
