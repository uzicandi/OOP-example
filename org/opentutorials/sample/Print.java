// 패키지
package org.opentutorials.sample;


// Refactor - Move file to New File
public class Print{ // package가 다르므로 public 추가

//class Print{ // 클래스 만듦!
	public String delimiter = ""; // Refactor - Rename 하면 한번에 바꿀 수 있음

	public Print(String delimeter) {
//		_delimiter = delimeter; // 입력한 parameter를 여기서 받아서 인자로 넣어줌.
		this.delimiter = delimeter;
		// this = 현재 이 클래스에서 만들어진 인스턴스를 가리킴. (_delimeter로 이름 변경 안하고 사용 가능)
	}


	public void A() { // 클래스의 멤버 A
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public void B() { // 클래스의 멤버 B
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

	public void test(Print target) {
		System.out.println(target == this);
	}



}