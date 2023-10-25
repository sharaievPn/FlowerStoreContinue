package ucu.edu.apps.flowerstoreContinue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.apps.flowerstoreContinue.Payments.CreditCardPaymentStrategy;
import ucu.edu.apps.flowerstoreContinue.Payments.PayPalPaymentStrategy;
import ucu.edu.apps.flowerstoreContinue.Payments.Payment;

public class PaymentTests {
    private Payment credit_card_pay;
    private Payment pay_pal;
    private double price;
    private double zeroPrice;



    @BeforeEach
    public void init() {
        credit_card_pay = new CreditCardPaymentStrategy();
        pay_pal = new PayPalPaymentStrategy();
        price = 100;
        zeroPrice = 0;
    }


    @Test
    public void testCreditCardPaymentNonZero() {
        boolean paidByCard = credit_card_pay.pay(price);
        assert (paidByCard);
    }

    @Test
    public void testPayPalPaymentNonZero() {
        boolean paidByPayPal = pay_pal.pay(price);
        assert (paidByPayPal);
    }

    @Test
    public void testPayPalPaymentZero() {
        boolean paidByPayPal = pay_pal.pay(zeroPrice);
        assert (!paidByPayPal);
    }

    @Test
    public void testCreditCardPaymentZero() {
        boolean paidByCard = credit_card_pay.pay(zeroPrice);
        assert (!paidByCard);
    }
}