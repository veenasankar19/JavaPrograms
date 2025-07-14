package Assignment;

public class offseason {
	double price;
	offseason(double price) {        //constructor offseason
        this.price = price;
    }

    public void discount() {
        double discountAmount = 0.15 * price;
        double finalPrice = price - discountAmount;

        System.out.println("Offseason");
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount (15%): ₹" + discountAmount);
        System.out.println("Final Price: ₹" + finalPrice);
    }
}
