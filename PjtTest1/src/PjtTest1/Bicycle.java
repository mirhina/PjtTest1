package PjtTest1;

public class Bicycle {
	
	public String color;
	public int price;
	
	public Bicycle() {
		// 생성자 1번 값을 메인에서 별도로 넣어주는 생성자
		System.out.println("Bicycle Constructor - 1 -");
	}
	
	public Bicycle(String c, int p) {
		// 생성자 2번 값을 생성자 호출 시 값을 입력하여 호출
		System.out.println("Bicycle Contstructor - 2 -");
		this.color = c;
		this.price = p;
	}
	
	public void info() {
		System.out.println("-----info----");
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
	}

}
