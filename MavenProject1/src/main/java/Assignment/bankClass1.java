package Assignment;

public class bankClass1 {
	private int pin;
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void validatePin() {
		if (pin==1001 || pin ==1234 || pin==1212) {
			System.out.println("Validated the PIN.");
		} else {
			System.out.println("Invalid PIN.");
		}
	}

}
