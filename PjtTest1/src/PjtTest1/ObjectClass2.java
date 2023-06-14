package PjtTest1;

public class ObjectClass2 {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass(); //레퍼런스가 가지고 있는 값은 객체의 주소값이므로 전부 다 다르다
		ObjectClass obj2 = new ObjectClass(); //ObjectClass에 아무것도 없으므르 default생성자가 자동 생성
		ObjectClass obj3 = new ObjectClass();
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		
		if(obj2 == obj3) {
			System.out.println("obj2 == obj3");
		} else {
			System.out.println("obj2 != obj3");
		}
		
		if(obj3 == obj1) {
			System.out.println("obj3 == obj1");
		} else {
			System.out.println("obj3 != obj1");
		}
		
		
		ObjectClass3 obj4 = new ObjectClass3();
		ObjectClass3 obj5 = new ObjectClass3();
		
		obj4.getInfo();
		
		obj4 = null; //레퍼런스의 주소값이 사라짐
		//obj4.getInfo(); // 주소값이 없으므로 애러 발생 NullPointException 애러
		
		obj5.getInfo(); // obj4만 주소값이 사라진 것이라 obj5에서는 정상적으로 값이 출력됨
		
		int arr[] = {10,20,30};
		ObjectClass3 obj6 = new ObjectClass3("JAVA", arr);
		obj6.getPrint();
		/*
		ObjectClass3 obj7;
		
		obj7 = new ObjectClass3();
		obj7 = new ObjectClass3();
		
		System.gc();
		
		int ins[] = {10, 20, 30};
		*/
		ObjectClass3 obj8 = new ObjectClass3(10,20);
		obj8.getThis();
		//ObjectClass3 obj8 = new ObjectClass3(10, "final", ins);
	}

}
