package PjtTest1;

public class Bicycle {
	
	public String color;
	public int price;
	
	public Bicycle() {
		// ������ 1�� ���� ���ο��� ������ �־��ִ� ������
		System.out.println("Bicycle Constructor - 1 -");
	}
	
	public Bicycle(String c, int p) {
		// ������ 2�� ���� ������ ȣ�� �� ���� �Է��Ͽ� ȣ��
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
