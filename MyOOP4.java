import org.opentutorials.sample.*;


// ������ : �ν��Ͻ��� ���涧 �ݵ�� �־�� �� ���� �����ϱ�
public class MyOOP4 {

	public static void main(String[] args) {
//		Print p1 = new Print();
//		p1.delimiter = "****"; // �ν��Ͻ���

		// ������ : Ŭ�����̸��� ���� �̸��� �޼ҵ�, �ν��Ͻ��� ������ �� ȣ��ǵ��� ���.
		// �ν��Ͻ��� �����ɶ� �ݵ�� ����Ǿ���� �ʱ�ȭ�� Constructor�� ������ ��.


//		org.opentutorials.sample.Print p1 = new org.opentutorials.sample.Print("----"); // "----" �� �������� Parameter�� �Է�
		Print p1 = new Print("----");
		// print��� Ŭ������ �ν��Ͻ� ���� -> print�� ���� �̸��� �޼ҵ� (������) ȣ�� -> �� �޼ҵ��� parameter ���� �ż� ����
		// Print.java ���� Print Method �θ�
		// �Ű������� ���� ���ڸ� �ν��Ͻ� ���� ������ �����ؾ���.

//		org.opentutorials.sample.Print p2 = new org.opentutorials.sample.Print("****");
		Print p2 = new Print("****");
		p1.test(p1);
		p2.test(p2);

	}

}
