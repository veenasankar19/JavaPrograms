package Assignment;

public class bankUser {

	public static void main(String[] args) {
		int typedPIN = 1234;
		bankClass1 c=new bankClass1();
		c.setPin(typedPIN);                      // send pin to bankClass1
		c.validatePin();                      //validate PIN
	}

}
