// 인스턴스 : 코드 중복 줄임!
public class MyOOP3 {

	public static void main(String[] args) {
		Print p1 = new Print();
		// print 클래스를 복제해서 아바타(인스턴스)를 만듦.
		p1.delimiter = "****";
		// class에서 static은 클래스 소속이라는 것. 인스턴스로 사용하려면 static 없애주면 됨.

		p1.A();
		p1.B();

		Print p2 = new Print();
		p2.delimiter = "----";

		p2.A();
		p2.B();
	}

}
