package PjtTest1;

public class ObjectClass3 {
	public void getInfo () {
		System.out.println("-----getInfo----");
	}
	
	public void getPrint() {
		System.out.println("++++getPrint++++");
	}
	
	public ObjectClass3(String s, int i[]) {
		System.out.println("사용자 지정 생성자");
		
		System.out.println("s : " + s);
		System.out.println("i : " + i); // 메모리 내에 객체 주소가 출력
	}

	public ObjectClass3() {
		System.out.println("Default 생성자");
	}
	
	/*@Override
	protected void finalize() throws Throwable {
		System.out.println("--- finalize() method --");
		super.finalize();
	}
	*/
	public int x;  // 여기에 있는 x y는 전역변수로 객체가 생성되고 소멸될때까지 유지됨
	public int y;
	
	public ObjectClass3(int x, int y) { // 여기서 사용된 x, y는 지역변수로 작업 완료 후 메모리에서 삭제된다
		System.out.println("--object class()--");
		this.x = x; //전역변수 x = 지역변수 x;
		this.y = y; // this는 현재 클래스에서 사용되는 객체를 지칭할 때 사용
	}
	
	public void getThis () {
		System.out.println("x : " + this.x);
		System.out.println("y : " + this.y);
	}

	
}
