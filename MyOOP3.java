// �ν��Ͻ� : �ڵ� �ߺ� ����!
public class MyOOP3 {

	public static void main(String[] args) {
		Print p1 = new Print();
		// print Ŭ������ �����ؼ� �ƹ�Ÿ(�ν��Ͻ�)�� ����.
		p1.delimiter = "****";
		// class���� static�� Ŭ���� �Ҽ��̶�� ��. �ν��Ͻ��� ����Ϸ��� static �����ָ� ��.

		p1.A();
		p1.B();

		Print p2 = new Print();
		p2.delimiter = "----";

		p2.A();
		p2.B();
	}

}
