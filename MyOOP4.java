import org.opentutorials.sample.*;


// 생성자 : 인스턴스가 생길때 반드시 있어야 할 값을 강제하기
public class MyOOP4 {

	public static void main(String[] args) {
//		Print p1 = new Print();
//		p1.delimiter = "****"; // 인스턴스식

		// 생성자 : 클래스이름과 같은 이름의 메소드, 인스턴스를 생성할 때 호출되도록 약속.
		// 인스턴스가 생성될때 반드시 실행되어야할 초기화를 Constructor에 넣으면 됨.


//		org.opentutorials.sample.Print p1 = new org.opentutorials.sample.Print("----"); // "----" 는 생성자의 Parameter로 입력
		Print p1 = new Print("----");
		// print라는 클래스로 인스턴스 생성 -> print와 같은 이름의 메소드 (생성자) 호출 -> 그 메소드의 parameter 값이 돼서 전달
		// Print.java 에서 Print Method 부름
		// 매개변수로 들어온 인자를 인스턴스 변수 값으로 설정해야함.

//		org.opentutorials.sample.Print p2 = new org.opentutorials.sample.Print("****");
		Print p2 = new Print("****");
		p1.test(p1);
		p2.test(p2);

	}

}
