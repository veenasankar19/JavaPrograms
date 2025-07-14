package Assignment;

public class onseason extends offseason {
	onseason(double price){
		super(price);                   //constructor of offseason
	}
	 public void discount() {
	        double discountAmount = 0.4 * price;
	        double finalPrice = price - discountAmount;

	        System.out.println("Onseason");
	        System.out.println("Original Price: ₹" + price);
	        System.out.println("Discount (15%): ₹" + discountAmount);
	        System.out.println("Final Price: ₹" + finalPrice);
	    }
	public static void main(String[] args) {

		onseason on=new onseason(1000);
		on.discount();
		System.out.println();
		offseason off=new offseason(1000);
		off.discount();
	}

}
