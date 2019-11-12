// 접근제어자 public 은 한번만 등장한돠.
public class MyOOP2 { // java 파일과 같은 이름의 클래스 만듦
	public static void main(String[] args) { // 그 클래스의 main 메소드

		Print.delimiter = "---";
		// 메소드 안에서 정의된 변수는 안에서만 사용 가능(유효범위)
		Print.A();
		Print.A();
		Print.B();
		Print.B();

		// Refactor - Extract Method (Eclipse 기능, 없으면 그냥 손으로~

		Print.delimiter= "****"; // class의 상태를 계속 바꾸고 있음. ==> 불편함 ===> 인스턴스 사용하자!

	}



}
