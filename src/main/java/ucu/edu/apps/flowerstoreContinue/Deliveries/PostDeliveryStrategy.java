package ucu.edu.apps.flowerstoreContinue.Deliveries;

import lombok.Getter;

public class PostDeliveryStrategy implements Delivery{
    @Getter
    private String description;
    @Override
    public boolean deliver() {
        System.out.println("The shipment is covered by Post");
        return true;
    }
    public PostDeliveryStrategy(){
        description = "Post delivery service";
    }
}
