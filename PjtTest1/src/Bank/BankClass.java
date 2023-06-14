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
	
	public void deposit() { //����
		System.out.println(" ---- deposit ---- ");
	}
	
	public void withdraw() { //���
		System.out.println(" ---- withdraw ---- ");
	}
	
	public abstract void installmentSavings(); //���� �߻�޼��� MyBankClass���� ��� ����
	
	public abstract void cancellation(); //�ؾ� �߻�޼��� MyBankClass���� ��� ����
	
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %d\n", totalAmount);
	}

}
