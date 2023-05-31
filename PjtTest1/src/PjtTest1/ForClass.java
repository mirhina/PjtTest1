package PjtTest1;

import java.util.Scanner;

public class ForClass {
	public static void main(String[] args) {
	
		System.out.println("구구단 단 숫자를 입력해 주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) { // i가 1이고 10보다 작을때까지 1씩 증가시켜라
			System.out.printf("%d X %d = %d \n" , inputNum , i , (inputNum*i));
		}
		scanner.close();
		
		System.out.println("구구단 단 숫자를 입력 : ");
		int num = scanner.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d X %d = %d \n", num , i , (num*i));
			i++;
		}
		
		do {
			System.out.println("무조건 1번은 실행");
		} while(false);
		
		
	}
}
