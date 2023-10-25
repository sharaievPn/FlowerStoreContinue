package ucu.edu.apps.flowerstorecontinue.payments;

public class PayPalPaymentStrategy implements Payment{
    private String paymentMethodDescription;
    public PayPalPaymentStrategy(){
        paymentMethodDescription = "PayPal";
    }
    @Override
    public boolean pay(double price) {
        if (price > 0) {
            System.out.printf("The price of %s is paid using PayPal.%n", price);
            return true;
        }
        System.out.println("Purchase is not fulfilled");
        return false;
    }
}
