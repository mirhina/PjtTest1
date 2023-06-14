package Parents;

public class AnonymousPrintClass {
	public static void main(String[] args) {
		new AnonymousClass() {
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method -- ");
			};
		}.method();
}
	
}
