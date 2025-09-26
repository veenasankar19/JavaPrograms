package Assignment;

public class salaryTest {
	public static void main(String[] args) {
    // Create a contractor
    employee contractor = new contractor("John", 20.0, 6);
    System.out.println("Contractor Salary: " + contractor.calculateSalary());

    // Create a full-time employee
    employee fullTime = new fullTimeEmployee("Alice", 25.0);
    System.out.println("Full-time Employee Salary: " + fullTime.calculateSalary());
}
}
