// ��Ű��
package org.opentutorials.sample;


// Refactor - Move file to New File
public class Print{ // package�� �ٸ��Ƿ� public �߰�

//class Print{ // Ŭ���� ����!
	public String delimiter = ""; // Refactor - Rename �ϸ� �ѹ��� �ٲ� �� ����

	public Print(String delimeter) {
//		_delimiter = delimeter; // �Է��� parameter�� ���⼭ �޾Ƽ� ���ڷ� �־���.
		this.delimiter = delimeter;
		// this = ���� �� Ŭ�������� ������� �ν��Ͻ��� ����Ŵ. (_delimeter�� �̸� ���� ���ϰ� ��� ����)
	}


	public void A() { // Ŭ������ ��� A
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public void B() { // Ŭ������ ��� B
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

	public void test(Print target) {
		System.out.println(target == this);
	}



}