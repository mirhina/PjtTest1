package PjtTest1;

import java.util.Scanner;

public class ForClass {
	public static void main(String[] args) {
	
		System.out.println("������ �� ���ڸ� �Է��� �ּ��� : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) { // i�� 1�̰� 10���� ���������� 1�� �������Ѷ�
			System.out.printf("%d X %d = %d \n" , inputNum , i , (inputNum*i));
		}
		scanner.close();
		
		System.out.println("������ �� ���ڸ� �Է� : ");
		int num = scanner.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d X %d = %d \n", num , i , (num*i));
			i++;
		}
		
		do {
			System.out.println("������ 1���� ����");
		} while(false);
		
		
	}
}
