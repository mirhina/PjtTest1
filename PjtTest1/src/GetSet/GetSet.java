package GetSet;

public class GetSet {

	public static void main(String[] args) {
		Student student1 = new Student("hong", 90);
		student1.getInfo();
		
		student1.setScore(100);
		student1.getInfo();
		
		student1.setScore(40); // setScore�κп� 50�̸����� ������ �ȵǰ� ����
		student1.getInfo(); //���� 40���� ������ �ȵ�
	}

}
