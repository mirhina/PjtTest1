package Abstract;

public class ClassEX extends AbstractClassEX{ //추상클래스 상속하기 위해 extends 이용
	
	public ClassEX() {
		System.out.println("ClassEX Constructor");
	}
	
	public ClassEX(int i, String s) { 
		super(i,s); 
	}

	@Override
	public void fun2() { //추상 클래스에서 구현한 추상 메서드 구현
		System.out.println(" --- fun2() ---");
	}

}
