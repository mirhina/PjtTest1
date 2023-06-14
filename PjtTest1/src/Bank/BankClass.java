package Bank;

public abstract class BankClass {
	
	String name;
	String account;
	int totalAmount;
	
	public BankClass() {
		System.out.println("BankClass Constructor");
	}
	
	public BankClass(String name, String account, int totalAmount) {
		System.out.println("BankClass Constructor");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	public void deposit() { //예금
		System.out.println(" ---- deposit ---- ");
	}
	
	public void withdraw() { //출금
		System.out.println(" ---- withdraw ---- ");
	}
	
	public abstract void installmentSavings(); //적금 추상메서드 MyBankClass에서 기능 구현
	
	public abstract void cancellation(); //해약 추상메서드 MyBankClass에서 기능 구현
	
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %d\n", totalAmount);
	}

}
