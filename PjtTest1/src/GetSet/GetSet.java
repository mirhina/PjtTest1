package GetSet;

public class GetSet {

	public static void main(String[] args) {
		Student student1 = new Student("hong", 90);
		student1.getInfo();
		
		student1.setScore(100);
		student1.getInfo();
		
		student1.setScore(40); // setScore부분에 50미만값은 수정이 안되게 설정
		student1.getInfo(); //따라서 40값도 변경이 안됨
	}

}
