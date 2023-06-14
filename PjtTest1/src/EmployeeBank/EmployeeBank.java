package EmployeeBank;

public class EmployeeBank {
	String name;
	static int amount =0;
	
	public EmployeeBank(String name) {
		this.name = name;
	}
	public void spendMoney(int money) {
		amount -= money;
		System.out.println("amount : " + amount);
	}
	public void SaveMoney(int money) {
		amount += money;
		System.out.println("amount : " + amount);
	}
	
	public void getBankInfo() {
		System.out.println("name : " + this.name);
		System.out.println("amount : " + this.name);
	}

}
