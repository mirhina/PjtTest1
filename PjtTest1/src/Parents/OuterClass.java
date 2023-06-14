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
		String str2 = str1; // 본인 클래스가 아니어도 InnerClass를 통해 사용 가능
		
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
