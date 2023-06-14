package Abstract;

public abstract class AbstractClassEX {
	int num;
	String str;
	
	public AbstractClassEX() { //추상클래스의 생성자
		System.out.println("AbstractClassEX Constructor");
	}
	
	public AbstractClassEX(int i, String s) { 
		System.out.println("AbstractClassEX Constructor");
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {  // 일반 메서드도 구현 가능
		System.out.println(" ----fun1()-----");
	}
	
	public abstract void fun2(); //추상 메서드 구현

}
