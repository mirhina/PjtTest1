package PjtTest1;

import java.util.Scanner;

public class IfClass {
	
	public static void main(String[] args) {
	
	int num1 = 10;
	int num2 = 20;
	
	if(num1 < num2) {
		System.out.println("num1�� num2���� �۴�");
	}
	
	System.out.println();
	
	if(num1 < num2) {
		System.out.println("num1�� num2���� �۴�");
	} else {
		System.out.println("num1�� num2���� ũ�ų� ����.");
	}
	
	System.out.println();
	
	if(num1 < num2) {
		System.out.println("num1�� num2���� �۴�.");
	} else if (num1 > num2) {
		System.out.println("num1�� num2���� ũ��.");
	} else {
		System.out.println("num1�� num2�� ����.");
	}
	
	System.out.println("====================================");
	
	System.out.println("������ �Է��Ͽ� �ּ��� : ");
	Scanner inputNum1 = new Scanner(System.in); // �Է¹�
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
	inputNum1.close(); // �Է¹� ����
	
	
	}
}
