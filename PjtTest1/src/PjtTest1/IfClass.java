package PjtTest1;

import java.util.Scanner;

public class IfClass {
	
	public static void main(String[] args) {
	
	int num1 = 10;
	int num2 = 20;
	
	if(num1 < num2) {
		System.out.println("num1은 num2보다 작다");
	}
	
	System.out.println();
	
	if(num1 < num2) {
		System.out.println("num1은 num2보다 작다");
	} else {
		System.out.println("num1은 num2보다 크거나 같다.");
	}
	
	System.out.println();
	
	if(num1 < num2) {
		System.out.println("num1은 num2보다 작다.");
	} else if (num1 > num2) {
		System.out.println("num1은 num2보다 크다.");
	} else {
		System.out.println("num1과 num2는 같다.");
	}
	
	System.out.println("====================================");
	
	System.out.println("점수를 입력하여 주세요 : ");
	Scanner inputNum1 = new Scanner(System.in); // 입력문
	int score = inputNum1.nextInt();
	
	switch (score) {
	case 100:
	case 90:
		System.out.println("A");
		break;
	
	case 80:
		System.out.println("B");
		break;
		
	case 70:
		System.out.println("C");
		break;
		
	case 60:
		System.out.println("D");
		break;
		
	default:
		System.out.println("F");
		break;
	}
	inputNum1.close(); // 입력문 종료
	
	
	}
}
