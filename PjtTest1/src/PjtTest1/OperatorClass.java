package PjtTest1;

import java.util.Arrays;
import java.util.Scanner;

public class OperatorClass {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int x = 10;
		int y = 20;
		
		//���� ������
		System.out.println("x = : " + x);
		System.out.println("y = : " + y);
		x = y;
		System.out.println("x = : " + x);
		System.out.println("y = : " + y);
		
		//��� ������
		x = 10;
		y = 20;
		System.out.println("x + y : " + (x+y));
		System.out.println("x - y : " + (x-y));
		System.out.println("x * y : " + (x*y));
		System.out.println("x / y : " + (x/y));
		System.out.println("x % y : " + (x%y));
		
		//���� ���� ������
		x = 10;
		System.out.println("x += 10 : " + (x += 10));
		x = 10;
		System.out.println("x -= 10 : " + (x -= 10));
		x = 10;
		System.out.println("x *= 10 : " + (x *= 10));
		x = 10;
		System.out.println("x /= 10 : " + (x /= 10));
		x = 10;
		System.out.println("x %= 10 : " + (x %= 10));
		/*
		 * x += 10
		 * x = x + 10
		 * 
		 * x -= 10
		 * x = x - 10
		 * 
		 * x *= 10
		 * x = x * 10
		 * 
		 * x /= 10
		 * x = x / 10
		 * 
		 * x %= 10
		 * x = x % 10
		 */
		
		//���� ������
		x = 10;
		y = 20;
		System.out.println("x > y : " + (x>y));
		System.out.println("x < y : " + (x<y));
		System.out.println("x >= y : " + (x>=y));
		System.out.println("x <= y : " + (x<=y));
		System.out.println("x == y : " + (x==y));
		System.out.println("x != y : " + (x!=y));
		
		//���� ������
		x = 10;
		System.out.println("++x : " + (++x));
		x = 10;
		System.out.println("--x : " + (--x));
		x = 10;
		System.out.println("x++ : " + (x++));
		System.out.println("x : " + (x));
		x = 10;
		System.out.println("x-- : " + (x--));
		System.out.println("x : " + (x));
		
		//�� ������
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 : " + (b1 && b2));
		System.out.println("b1 || b2 : " + (b1 || b2));
		System.out.println("!b1 : " + (!b1));
		System.out.println("!b2 : " + (!b2));
		
		//����(����) ������
		x = 10;
		y = 20;
		int result = 0;
		result = (x>y) ? 100 : 200;
		System.out.println("result : " + (result));
		
		result = (x<y) ? 100 : 200;
		System.out.println("result : " + (result));
		
		result = (x == y) ? 100 : 200;
		System.out.println("result : " + (result));
		
		//��Ʈ ������
		x = 2;
		y = 3;
		System.out.println("x & y : " + (x & y));
		System.out.println("x | y : " + (x | y));
		System.out.println("x ^ y : " + (x ^ y));
		
		//�迭 ���� �� �ʱ�ȭ
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		//�迭 ����� ���ÿ� �ʱ�ȭ
		int[] arr2 = {10, 20, 30, 40, 50};
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4]);
		
		System.out.println("arr2[5] : " + arr2[5]); // Error! �迭 ������ ���
		
		String[] name = {"Ű�Ƴ�","��γ�","����","����","������"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s ���� : \t%.2f\n", name[0], (double)score[0]);
		System.out.printf("%s ���� : \t%.2f\n", name[1], (double)score[1]);
		System.out.printf("%s ���� : \t%.2f\n", name[2], (double)score[2]);
		System.out.printf("%s ���� : \t%.2f\n", name[3], (double)score[3]);
		System.out.printf("%s ���� : \t%.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("-------------------\n ���� : \t%.2f", ave);
		
		scanner.close();
		
		System.out.println();
		
		//�迭�� �⺻�Ӽ�
		int[] arrAtt1 = {10,20,30,40};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		//�迭�� ����
		System.out.printf("arrAtt1.length : " + arrAtt1.length);
		
		//�迭 ��� ���
		System.out.printf("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		//�迭 ��� ����
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		//�迭 ���۷���
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2); //�迭�� �״�� ȣ���Ͽ� ��� �� �ּҰ��� ����
		System.out.println("arrAtt3 : " + arrAtt3); //�迭 ��Ҹ� �����Ͽ� ��� �� �ּҰ��� �ٸ�
		
		//������ �迭
		int [][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + arrMul[0]);
		System.out.println("arrMul[1] : " + arrMul[1]);
		System.out.println("arrMul[2] : " + arrMul[2]);
	}

}
