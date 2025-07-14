package Assignment;

public class salaryClass3 {

	public static void main(String[] args) {
		
		salaryClass1 emp = new salaryClass1(30000, 2000, 5000);

		salaryClass2 sc = new salaryClass2();                                               // Calculate HRA and PF
        sc.calculateComponents(emp.basicPay);
        
        double totalSalary = emp.basicPay + sc.hra - sc.pf - emp.deduction + emp.bonus;     // Calculate total salary
    
        System.out.println("Basic Pay    : " + emp.basicPay);
        System.out.println("HRA (5%)     : " + sc.hra);
        System.out.println("PF (20%)     : " + sc.pf);
        System.out.println("Deduction    : " + emp.deduction);
        System.out.println("Bonus        : " + emp.bonus);
        System.out.println("Net Salary   : " + totalSalary);
    }
}
