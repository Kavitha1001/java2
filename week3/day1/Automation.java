package week3.day1;

public class Automation extends MultipleLangauge implements Language,TestTool  {

	public static void main(String[] args) {
		
		Automation a=new Automation();
		a.Java();
		a.python();
		a.ruby();
		a.Selenium();

	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

}
