package Parents;

public class ParentChildClass {

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		ParentClass parentClass = new ParentClass();
		childClass.childFun();
		childClass.parentFun();
		
		//childClass.privateDun();// �θ�Ŭ�������� ������ �κ��̾ private�� ���� �Ұ�
		System.out.println("-------------------------");
		parentClass.overrideClass();
		childClass.overrideClass();
		
		ParentClass[] pArr = new ParentClass[2];
		
		ParentClass fch = new ChildClass(); // ParentClass�� ��ӹ޾ұ� ������ ������ ParentClass�� �ص� �����ϴ�.
		ParentClass sch = new SecondChildClass(); //�̷��� ���� �� ������ �迭�� ���� �� �ڷ����� �����Ͽ� ������ �����ϴ�.
		
		pArr[0] = fch;
		pArr[1] = sch;
		
		System.out.println("--------------------------");
		ChildClass c = new ChildClass();
		c.getOpenYear();

	}

}
