package Abstract;

public abstract class AbstractClassEX {
	int num;
	String str;
	
	public AbstractClassEX() { //�߻�Ŭ������ ������
		System.out.println("AbstractClassEX Constructor");
	}
	
	public AbstractClassEX(int i, String s) { 
		System.out.println("AbstractClassEX Constructor");
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {  // �Ϲ� �޼��嵵 ���� ����
		System.out.println(" ----fun1()-----");
	}
	
	public abstract void fun2(); //�߻� �޼��� ����

}
