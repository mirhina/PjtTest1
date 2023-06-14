package Lamda;

public class LamdaMain {

	public static void main(String[] args) {
		// �Ű������� ���๮������ �ۼ��Ѵ�. (������, ��ȯ��, return Ű���� ����)
		LamdaInterface1 li1 = (String s1, String s2, String s3) -> {System.out.println(s1 + " " + s2 + " " + s3);};
		li1.method("Hello","JAVA","World!");
		
		System.out.println();
		
		//�Ű������� 1���̰ų� Ÿ���� ���� ��, Ÿ���� ������ �� �ִ�
		LamdaInterface2 li2 = (s1) -> {System.out.println(s1); };
		li2.method("Hello");
		
		//���๮�� 1���� ��, '{}'�� ������ �� �ִ�
		LamdaInterface2 li3 = (s1) -> {System.out.println(s1); };
		li3.method("Hello");
		
		//�Ű������� ���๮�� 1���� ��, '()'�� '{}'�� ������ �� �ִ�
		LamdaInterface2 li4 = s1 -> System.out.println(s1);
		li4.method("Hello");
		
		//�Ű������� ���� ��, '()'�� �ۼ��Ѵ�
		LamdaInterface3 li5 = () -> System.out.println("no parameter");
		li5.method();
		
		//��ȯ���� �ִ� ���
		LamdaInterface4 li6 = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
		li6 = (x,y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
		li6 = (x,y) -> {
			int result = x - y;
			return result;
		};
		System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));

	}

}