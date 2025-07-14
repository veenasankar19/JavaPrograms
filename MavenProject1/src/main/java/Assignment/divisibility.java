package Assignment;

public class divisibility extends addition {
	public void displayy() {

        if (c % 10 == 0) {
            System.out.println("The result is divisible by 10.");
        } else {
            System.out.println("The result is NOT divisible by 10.");
        }
    }

	public static void main(String[] args) {
		divisibility obj = new divisibility();
        obj.displayy();
	}

}
