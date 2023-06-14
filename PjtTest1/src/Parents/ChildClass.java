package Parents;

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("ChildClass Constructor");
	}
	public void childFun() {
		System.out.println("ChildFun");
	}
	@Override
	public void overrideClass() {
		System.out.println("First ChildOverride!!");
	}
	
	int openYear = 2023;
	public void getOpenYear() {
		System.out.println("ChildClass Open Year : " + this.openYear);
		System.out.println("ParentClass Open Year : " + super.openYear);
	}
}
