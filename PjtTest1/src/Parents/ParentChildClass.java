package Parents;

public class ParentChildClass {

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		ParentClass parentClass = new ParentClass();
		childClass.childFun();
		childClass.parentFun();
		
		//childClass.privateDun();// 부모클래스에서 선언한 부분이어도 private은 접근 불가
		System.out.println("-------------------------");
		parentClass.overrideClass();
		childClass.overrideClass();
		
		ParentClass[] pArr = new ParentClass[2];
		
		ParentClass fch = new ChildClass(); // ParentClass를 상속받았기 때문에 선언을 ParentClass로 해도 무방하다.
		ParentClass sch = new SecondChildClass(); //이렇게 선언 시 장점은 배열을 만들 때 자료형이 동일하여 선언이 용이하다.
		
		pArr[0] = fch;
		pArr[1] = sch;
		
		System.out.println("--------------------------");
		ChildClass c = new ChildClass();
		c.getOpenYear();

	}

}
