package PjtTest1;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	public String tel;
	public String email;
	public int tag;
	
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass Constructor	");
	}
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo I ----");
		name = n;
		gender = g;
		age = a;
	}
	public void setInfo(String t, String e) {
		System.out.println(" -- setInfo II ----");
		tel = t;
		email = e;
	}
	
	public void getInfo() {
		System.out.println("--getInfo I ----");
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);	
	}
	
	public void getInfo(String t, String e) {
		System.out.println("--getInfo II ----");
		System.out.println("tel : " + tel);
		System.out.println("email : " + email);
		secrete(); // private 메서드 호출
	}
	
	private void secrete() {
		System.out.println("\n !! secrete !! \n");
		// private 메서드는 다른 클래스파일에서 호출이 불가능함
	}

}
