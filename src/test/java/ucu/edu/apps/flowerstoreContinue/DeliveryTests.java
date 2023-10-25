package ucu.edu.apps.flowerstoreContinue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.apps.flowerstoreContinue.Deliveries.DHLDeliveryStrategy;
import ucu.edu.apps.flowerstoreContinue.Deliveries.Delivery;
import ucu.edu.apps.flowerstoreContinue.Deliveries.PostDeliveryStrategy;


public class DeliveryTests {

    private Delivery deliveryDHL;
    private Delivery post;



    @BeforeEach
    public void init() {
        deliveryDHL = new DHLDeliveryStrategy();
        post = new PostDeliveryStrategy();
    }


    @Test
    public void deliveryDHLProcess() {
        boolean underDelivery = deliveryDHL.deliver();
        assert (underDelivery);
    }

    @Test
    public void postDeliveryProcess() {
        boolean postDelivery = post.deliver();
        assert (postDelivery);
    }

}
