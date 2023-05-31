package PjtTest1;

public class RideClass {
	public static void main(String[] args) {
		GrandeurClass myCar1 = new GrandeurClass();
		myCar1.color = "Red";
		myCar1.gear = "Auto";
		myCar1.price = 200000;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		System.out.println("---------------------------------------");
		
		GrandeurClass myCar2 = new GrandeurClass(); // new GrandeurClass �κ��� Ŭ���� �� ������ �κ��� ȣ��
		myCar2.color = "Blue";
		myCar2.gear = "Manual";
		myCar2.price = 300000;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		Bicycle myBicycle1 = new Bicycle();
		myBicycle1.color = "Yellow";
		myBicycle1.price = 10000;
		myBicycle1.info();
		
		Bicycle myBicycle2 = new Bicycle("Green", 40000);
		myBicycle2.info(); // ������ ȣ�� �� ���� �־ ���� Ŭ���� ������ �̸� ���� ����
		
		myBicycle2.color = "purple"; // �� ���� �� ���� ������� �Է��ϸ� �����
		myBicycle2.info();
	}

}
