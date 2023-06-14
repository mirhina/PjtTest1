package Member;

import EmployeeBank.EmployeeBank;

public class MemberList {
	public static void main(String args[]) {
		DailyJournal dailyJournal = new DailyJournal();
		Employee employee = new Employee();
		Payment payment = new Payment();
		EmployeeBank fulltime = new EmployeeBank(null);
		PartTime partTime = new PartTime();
		Util util = new Util();
		Welfare welfare = new Welfare();
		
		System.out.println();
		
		EmployeeBank parkBank = new EmployeeBank("parkchan");
		parkBank.SaveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("leesoung");
		leeBank.SaveMoney(300);
		
		leeBank.getBankInfo();
		parkBank.spendMoney(400);
		leeBank.getBankInfo();
	}

}
