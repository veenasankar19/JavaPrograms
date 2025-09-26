package Assignment;

public abstract class employee {	                              // Abstract superclass
	    String name;
	    double paymentPerHour;

	    employee(String name, double paymentPerHour) {	      // Abstract superclass
	        this.name = name;
	        this.paymentPerHour = paymentPerHour;
	    }
	    
	    abstract double calculateSalary();                                 // Abstract method to be implemented by subclasses
	}


	