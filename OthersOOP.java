import java.io.FileWriter; // �ڹ� ���� �̸� ���� (Java Lang ���� ���� ������)
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException { // ���� ���������� ����ó�� ����Ұ��� ���� : IOException

		// class : System, Math, FileWriter
		// instance : f1, f2

		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8)); // Math Ŭ������ �ִ� method �׳� ���

		//
		FileWriter f1 = new FileWriter("data.txt");
	//  "������ Ÿ��""������"  "Ŭ�����̸�"   "�����ϰ���� �����̸�"

		f1.write("write");
		f1.write(" Java");
		f1.close(); // ���� �۾��� ���µ�

		FileWriter f2 = new FileWriter("data2.txt");
		//  ������ Ÿ��     ������  Ŭ������ ��´�   Ŭ�����̸�
		f2.write("write");
		f2.write(" Java");
		f2.close();



	}

}
