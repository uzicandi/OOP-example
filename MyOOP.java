
public class MyOOP {
	public static String delimiter = "----";
	public static void main(String[] args) {

		delimiter = "---";
		// 메소드 안에서 정의된 변수는 안에서만 사용 가능(유효범위)
		printA(delimiter);
		printA(delimiter);
		// Refactor - Extract Method (Eclipse 기능, 없으면 그냥 손으로~

		delimiter = "****";
		printB(delimiter);
		printB(delimiter);
	}

	private static void printA(String delimiter) {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	private static void printB(String delimiter) {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}


}


