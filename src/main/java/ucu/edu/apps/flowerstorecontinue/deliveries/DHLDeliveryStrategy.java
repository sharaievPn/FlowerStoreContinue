package ucu.edu.apps.flowerstorecontinue.deliveries;

import lombok.Getter;

public class DHLDeliveryStrategy implements Delivery {
    @Getter
    private String description;
    public DHLDeliveryStrategy(){
        description = "DHL delivery service";
    }
    @Override
    public boolean deliver() {
        System.out.println("The shipment is covered by DHL");
        return true;
    }
}
