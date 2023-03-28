package contractServices;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double interest(double amount, int months) {
        double result = amount + ((amount / 100) * months);
        result += paymentFee(result);
        return result;
    }

    @Override
    public double paymentFee(double amount) {
        return ((amount * 2) / 100);
    }

}
