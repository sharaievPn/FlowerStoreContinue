package ucu.edu.apps.flowerstoreContinue.Deliveries;

import lombok.Getter;

public class DHLDeliveryStrategy implements Delivery{
    @Getter
    private String description;
    @Override
    public boolean deliver() {
        System.out.println("The shipment is covered by DHL");
        return true;
    }
    public DHLDeliveryStrategy(){
        description = "DHL delivery service";
    }
}
