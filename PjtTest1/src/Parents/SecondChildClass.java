package Parents;

public class SecondChildClass extends ParentClass{
	public SecondChildClass() {
		System.out.println("SecondChildClass Constructor");
	}
	
	public void secondChildFun() {
		System.out.println("secondChildFun");
	}
	@Override
	public void overrideClass() {
		System.out.println("Second ChildOverride!!");
	}

}
