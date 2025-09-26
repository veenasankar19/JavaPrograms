package Assignment;

public class contractor extends employee {
    int workingHours;

     // Constructor
    contractor(String name, double paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

                                                                             // Own implementation of calculateSalary()
    double calculateSalary() {
        return paymentPerHour * workingHours;
    }
}