
public class MyOOP {
	public static String delimiter = "----";
	public static void main(String[] args) {

		delimiter = "---";
		// �޼ҵ� �ȿ��� ���ǵ� ������ �ȿ����� ��� ����(��ȿ����)
		printA(delimiter);
		printA(delimiter);
		// Refactor - Extract Method (Eclipse ���, ������ �׳� ������~

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


