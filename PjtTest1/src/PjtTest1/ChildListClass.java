package PjtTest1;

public class ChildListClass {
	public static void main(String [] args) {
		ChildClass child1 = new ChildClass();
		child1.name = "hong";
		child1.gender = "male";
		child1.age = 12;
		
		child1.getInfo();
		
		System.out.println("\n++++++++++++++++++++++++++++\n");
		
		ChildClass child2 = new ChildClass();
		child2.setInfo("hee", "female", 11);
		child2.getInfo();
		
		System.out.println("\n++++++++++++++++++++++++++++\n");
		
		ChildClass child3 = new ChildClass();
		child3.setInfo("010-2233-4455", "aabbcc@naver.com");
		child3.getInfo("","");
	}

}
