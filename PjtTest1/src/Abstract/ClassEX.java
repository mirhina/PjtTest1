package Abstract;

public class ClassEX extends AbstractClassEX{ //�߻�Ŭ���� ����ϱ� ���� extends �̿�
	
	public ClassEX() {
		System.out.println("ClassEX Constructor");
	}
	
	public ClassEX(int i, String s) { 
		super(i,s); 
	}

	@Override
	public void fun2() { //�߻� Ŭ�������� ������ �߻� �޼��� ����
		System.out.println(" --- fun2() ---");
	}

}
