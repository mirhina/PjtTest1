package StringBufferBuilder;

public class StringMain {

	public static void main(String[] args) {
		//String str1 = "JAVA";
		String str1 = new String("JAVA"); 
		System.out.println("str1 : " + str1);
		str1 = str1 + "_8";
		
		System.out.println("str1 : " + str1);
		
		//StringBuffer
		StringBuffer str2 = new StringBuffer("Hello");
		System.out.println("str2 : " + str2);
		str2.append(" World!");
		
		System.out.println("str2 : " + str2);
		System.out.println("str2.length() : " + str2.length());
		
		str2.insert(5, " JAVA"); // 5���� �ڿ� ���� �߰�
		
		System.out.println("str2 : " + str2);
		
		str2.delete(4, 8); // 5��° ���ں��� 8��° ���ڱ��� ����
		System.out.println("str2 : " + str2);
		
		StringBuilder str3 = new StringBuilder("Java World!");
		System.out.println("str3 : " + str3);
		

	}

}
