package Bank;

public class BankMainClass {

	public static void main(String[] args) {
		BankClass myBank = new MyBankClass("park", "123-4567-8989", 10000);
		
		myBank.deposit(); //����
		myBank.withdraw(); //���
		myBank.installmentSavings(); //����
		myBank.cancellation(); //�ؾ�
		
		System.out.println();
		
		myBank.getInfo();

	}

}
