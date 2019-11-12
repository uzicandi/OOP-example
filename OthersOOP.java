import java.io.FileWriter; // 자바 내에 이름 지정 (Java Lang 내에 없기 때문에)
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException { // 파일 에러났을때 에러처리 어떻게할건지 설정 : IOException

		// class : System, Math, FileWriter
		// instance : f1, f2

		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8)); // Math 클래스에 있는 method 그냥 사용

		//
		FileWriter f1 = new FileWriter("data.txt");
	//  "데이터 타입""변수명"  "클래스이름"   "저장하고싶은 파일이름"

		f1.write("write");
		f1.write(" Java");
		f1.close(); // 파일 작업을 끝냈따

		FileWriter f2 = new FileWriter("data2.txt");
		//  데이터 타입     변수명  클래스를 담는다   클래스이름
		f2.write("write");
		f2.write(" Java");
		f2.close();



	}

}
