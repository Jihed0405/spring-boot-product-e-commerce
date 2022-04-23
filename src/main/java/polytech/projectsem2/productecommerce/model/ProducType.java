package polytech.projectsem2.productecommerce.model;

public enum ProducType {
    BAGS("BAGS"),
    SMALL_LEATHER_GOODS("SMALL LEATHER GOODS"),
    ACCESSORIES("ACCESSORIES"),
    READY_TO_WEAR("READY-TO-WEAR"),
    SHOES("SHOES"),
    FASHION_JEWELRY("FASHION JEWELRY");
    private String displayProductType;

    ProducType(String displayProductType) {
        this.displayProductType = displayProductType;
    }

    public String displayName() { return displayProductType; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayProductType; }
}
