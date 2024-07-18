package scope;

class Person {
	
	
	// 인스턴스변수는 객체를 생성한 후부터 사용가능
	// 전역변수는 클래스 안에서 어디서나 사용가능
	String personName; 
	int personAge;  
	
	//클래스변수는 프로그램 실행 후 바로 사용 가능
	static char gender = 'F';  
	
	// 지역변수는 함수 안에서만 사용 가능
	public void setPersonName(String name) { 
		this.personName = name; 
	}
	
	
	
	
}
