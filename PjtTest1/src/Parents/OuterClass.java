package Parents;

public class OuterClass {

	int num = 10;
	String str1 = "JAVA";
	static String str11 = "World!";
	public OuterClass() {
		System.out.println("OuterClass");
	}
	
	class InnerClass {
		int num = 100;
		String str2 = str1; // ���� Ŭ������ �ƴϾ InnerClass�� ���� ��� ����
		
		public InnerClass() {
			System.out.println("InnerClass Constructor");
		}
	}
	static class SInnerClass {
		int num = 1000;
		String str3 = str11;
		
		public SInnerClass() {
		System.out.println("Static InnerClass Constructor");	
		}
	}

}
