// ���������� public �� �ѹ��� �����ѵ�.
public class MyOOP2 { // java ���ϰ� ���� �̸��� Ŭ���� ����
	public static void main(String[] args) { // �� Ŭ������ main �޼ҵ�

		Print.delimiter = "---";
		// �޼ҵ� �ȿ��� ���ǵ� ������ �ȿ����� ��� ����(��ȿ����)
		Print.A();
		Print.A();
		Print.B();
		Print.B();

		// Refactor - Extract Method (Eclipse ���, ������ �׳� ������~

		Print.delimiter= "****"; // class�� ���¸� ��� �ٲٰ� ����. ==> ������ ===> �ν��Ͻ� �������!

	}



}
