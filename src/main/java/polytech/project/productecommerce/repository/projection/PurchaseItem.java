package polytech.project.productecommerce.repository.projection;

import java.time.LocalDateTime;

import polytech.project.productecommerce.model.ProducType;

public interface PurchaseItem {
    String getName();

    ProducType getType();

    Double getPrice();

    String getColor();

    LocalDateTime getPurchaseTime();
}
