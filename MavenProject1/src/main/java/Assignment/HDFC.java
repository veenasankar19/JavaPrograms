package Assignment;

public class HDFC implements RBI {

    
    public void recurringDeposit(double amount, int months) {                         // Implement recurring deposit calculation
        double maturityAmount;

        maturityAmount = (amount * months) +
            ((amount * months * (months + 1) * INTEREST_RATE) / (2 * 12 * 100));

        System.out.println("Monthly Deposit: ₹" + amount);
        System.out.println("Duration: " + months + " months");
        System.out.println("Interest Rate (annual): " + INTEREST_RATE + "%");
        System.out.printf("Maturity Amount after %d months: ₹%.2f\n", months, maturityAmount);
    }
}
