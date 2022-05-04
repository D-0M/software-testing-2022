
public class CalculatIntrerest {

    public double AccountIntreset(double money) {

        double interest = 0;
        // less than zero
        if (money < 0)
            throw new IllegalArgumentException("Invalde input!");
        // $0 up to $100
        if (money >= 0 && money <= 100)
            interest += 0.03 * money;
        // over $100 and up to $1000
        if (money > 100 && money < 1000)
            interest += 0.05 * money;
        // $1000 and over
        if (money >= 1000)
            interest += 0.07 * money;

        return interest;
    }
}
