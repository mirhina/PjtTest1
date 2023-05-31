package PjtTest1;

public class GrandeurClass {  // 클래스 이름. 첫글자는 대문자로 시작이 국룰
	
	public String color;
	public String gear;  // 맴버변수
	public int price;
	public String info;
	
	public GrandeurClass() {  // 생성자. 클래스명과 같은이름에 반환형이 없음 클래스 호출 시 가장 먼저 호출이 된다
		System.out.println("Grandeur Constructor");
	}
	public void run() {
		System.out.println("----run-----");  // 메서드 (기능)
	}
	public void stop()
	{
		System.out.println("++++stop++++");  // 메서드 (기능)
	}
	public void info() {
		System.out.println("----info----");
		System.out.println("Color : " + color);
		System.out.println("Gear : " + gear);
		System.out.println("Price : " + price);
	}
}
