package Assignment;

public class salaryClass2 {
	double hra;
    double pf;

    public void calculateComponents(double basicPay) {
        hra = 0.05 * basicPay;                             // 5% HRA
        pf = 0.20 * basicPay;                              // 20% PF
    }
}
