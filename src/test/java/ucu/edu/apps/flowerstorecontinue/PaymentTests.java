package ucu.edu.apps.flowerstorecontinue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.apps.flowerstorecontinue.payments.CreditCardPaymentStrategy;
import ucu.edu.apps.flowerstorecontinue.payments.PayPalPaymentStrategy;
import ucu.edu.apps.flowerstorecontinue.payments.Payment;

public class PaymentTests {
    private Payment creditCardPay;
    private Payment payPal;
    private double PRICE;
    private double ZEROPRICE;



    @BeforeEach
    public void init() {
        creditCardPay = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
        PRICE = 100.0;
        ZEROPRICE = 0;
    }


    @Test
    public void testCreditCardPaymentNonZero() {
        boolean paidByCard = creditCardPay.pay(PRICE);
        assert (paidByCard);
    }

    @Test
    public void testPayPalPaymentNonZero() {
        boolean paidByPayPal = payPal.pay(PRICE);
        assert (paidByPayPal);
    }

    @Test
    public void testPayPalPaymentZero() {
        boolean paidByPayPal = payPal.pay(ZEROPRICE);
        assert (!paidByPayPal);
    }

    @Test
    public void testCreditCardPaymentZero() {
        boolean paidByCard = creditCardPay.pay(ZEROPRICE);
        assert (!paidByCard);
    }
}