package PjtTest1;

public class ObjectClass2 {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass(); //���۷����� ������ �ִ� ���� ��ü�� �ּҰ��̹Ƿ� ���� �� �ٸ���
		ObjectClass obj2 = new ObjectClass(); //ObjectClass�� �ƹ��͵� �����Ǹ� default�����ڰ� �ڵ� ����
		ObjectClass obj3 = new ObjectClass();
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		
		if(obj2 == obj3) {
			System.out.println("obj2 == obj3");
		} else {
			System.out.println("obj2 != obj3");
		}
		
		if(obj3 == obj1) {
			System.out.println("obj3 == obj1");
		} else {
			System.out.println("obj3 != obj1");
		}
		
		
		ObjectClass3 obj4 = new ObjectClass3();
		ObjectClass3 obj5 = new ObjectClass3();
		
		obj4.getInfo();
		
		obj4 = null; //���۷����� �ּҰ��� �����
		//obj4.getInfo(); // �ּҰ��� �����Ƿ� �ַ� �߻� NullPointException �ַ�
		
		obj5.getInfo(); // obj4�� �ּҰ��� ����� ���̶� obj5������ ���������� ���� ��µ�
		
		int arr[] = {10,20,30};
		ObjectClass3 obj6 = new ObjectClass3("JAVA", arr);
		obj6.getPrint();
		/*
		ObjectClass3 obj7;
		
		obj7 = new ObjectClass3();
		obj7 = new ObjectClass3();
		
		System.gc();
		
		int ins[] = {10, 20, 30};
		*/
		ObjectClass3 obj8 = new ObjectClass3(10,20);
		obj8.getThis();
		//ObjectClass3 obj8 = new ObjectClass3(10, "final", ins);
	}

}
