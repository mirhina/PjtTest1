package PjtTest1;

public class ObjectClass3 {
	public void getInfo () {
		System.out.println("-----getInfo----");
	}
	
	public void getPrint() {
		System.out.println("++++getPrint++++");
	}
	
	public ObjectClass3(String s, int i[]) {
		System.out.println("����� ���� ������");
		
		System.out.println("s : " + s);
		System.out.println("i : " + i); // �޸� ���� ��ü �ּҰ� ���
	}

	public ObjectClass3() {
		System.out.println("Default ������");
	}
	
	/*@Override
	protected void finalize() throws Throwable {
		System.out.println("--- finalize() method --");
		super.finalize();
	}
	*/
	public int x;  // ���⿡ �ִ� x y�� ���������� ��ü�� �����ǰ� �Ҹ�ɶ����� ������
	public int y;
	
	public ObjectClass3(int x, int y) { // ���⼭ ���� x, y�� ���������� �۾� �Ϸ� �� �޸𸮿��� �����ȴ�
		System.out.println("--object class()--");
		this.x = x; //�������� x = �������� x;
		this.y = y; // this�� ���� Ŭ�������� ���Ǵ� ��ü�� ��Ī�� �� ���
	}
	
	public void getThis () {
		System.out.println("x : " + this.x);
		System.out.println("y : " + this.y);
	}

	
}
