package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("id: "+ id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("id: "+ id +" name: "+ name );
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email: "+email+ " phn: "+ phoneNumber);
	}
	public static void main(String[] args)
	{
		Students s = new  Students();
		s.getStudentInfo(044);
		s.getStudentInfo(044, "Kavitha");
		s.getStudentInfo("kavithailayaraja92@gmail.com",8903103764l);
	}

}

