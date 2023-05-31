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
		
		GrandeurClass myCar2 = new GrandeurClass(); // new GrandeurClass 부분이 클래스 내 생성자 부분을 호출
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
		myBicycle2.info(); // 생성자 호출 시 값을 넣어서 생성 클래스 내에서 미리 형식 선언
		
		myBicycle2.color = "purple"; // 값 변경 시 기존 방식으로 입력하면 변경됨
		myBicycle2.info();
	}

}
