package PjtTest1;

public class GrandeurClass {  // Ŭ���� �̸�. ù���ڴ� �빮�ڷ� ������ ����
	
	public String color;
	public String gear;  // �ɹ�����
	public int price;
	public String info;
	
	public GrandeurClass() {  // ������. Ŭ������� �����̸��� ��ȯ���� ���� Ŭ���� ȣ�� �� ���� ���� ȣ���� �ȴ�
		System.out.println("Grandeur Constructor");
	}
	public void run() {
		System.out.println("----run-----");  // �޼��� (���)
	}
	public void stop()
	{
		System.out.println("++++stop++++");  // �޼��� (���)
	}
	public void info() {
		System.out.println("----info----");
		System.out.println("Color : " + color);
		System.out.println("Gear : " + gear);
		System.out.println("Price : " + price);
	}
}
