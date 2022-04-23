package polytech.projectsem2.productecommerce.repository.projection;

import java.time.LocalDateTime;

import polytech.projectsem2.productecommerce.model.ProducType;



public interface PurchaseItem {
    String getName();
    ProducType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
