package Assignment;

public class fullTimeEmployee extends employee {

    // Constructor
    fullTimeEmployee(String name, double paymentPerHour) {
        super(name, paymentPerHour);
    }

                                                                  // Own implementation — always multiply by 8 hours
    double calculateSalary() {
        return paymentPerHour * 8;
    }
}