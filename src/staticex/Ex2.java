package staticex;

public class Ex2 {

	public static void main(String[] args) {
		
		
		
		
	

	}

}

class Student2{
	
	private static int count = 0;
	int studentID;
	String studentName;
	
	public Student2() {
		count++;
		studentID = count;
		
		
	}
	
	public int getCount() {
		return count;
	}
	
	public static void setCount(int cnt) {
		Student2.count = cnt;
//		studentName = "둘리"; 에러남
		
	}
		
	
	
}
