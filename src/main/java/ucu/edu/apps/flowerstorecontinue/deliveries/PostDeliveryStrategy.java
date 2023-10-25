package ucu.edu.apps.flowerstorecontinue.deliveries;

import lombok.Getter;

public class PostDeliveryStrategy implements Delivery {
    @Getter
    private String description;
    public PostDeliveryStrategy() {
        description = "Post delivery service";
    }
    @Override
    public boolean deliver() {
        System.out.println("The shipment is covered by Post");
        return true;
    }
}
