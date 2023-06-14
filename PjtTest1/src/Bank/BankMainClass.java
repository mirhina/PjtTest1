package Bank;

public class BankMainClass {

	public static void main(String[] args) {
		BankClass myBank = new MyBankClass("park", "123-4567-8989", 10000);
		
		myBank.deposit(); //예금
		myBank.withdraw(); //출금
		myBank.installmentSavings(); //적금
		myBank.cancellation(); //해약
		
		System.out.println();
		
		myBank.getInfo();

	}

}
