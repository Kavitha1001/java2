package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String s1="Testleaf";
		char c='e';
		int count=0;
		
	    char[] chr=s1.toCharArray();
	    
		for (int i = 0; i < chr.length; i++) {
			if(chr[i]==c)
			{
				count++;
			}
			
		}
		System.out.println(count);
				
		

	}

}
