package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=132;
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i!=0)
			{
				System.out.println("the given number is prime");
			}
			else if(n%i==0)
			{
			System.out.println("the given number is non-prime");
			}
			break;
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
