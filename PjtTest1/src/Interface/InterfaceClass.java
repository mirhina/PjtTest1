package Interface;

public class InterfaceClass implements InterfaceA, InterfaceB {
	public InterfaceClass() {
		System.out.println("InterfaceClass Constructor");
	}
	@Override
	public void funA() {
		System.out.println("InterfaceA");
	}

	@Override
	public void funB() {
		System.out.println("InterfaceB");
	}


}
