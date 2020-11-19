package lk.rangafarm.pos.view.tm;

public class FoodTM {
    private String productId;
    private String description;
    private double unitPrice;
    private int qtyOnHand;

    public FoodTM() {
    }

    public FoodTM(String productId, String description, double unitPrice, int qtyOnHand) {
        this.setProductId(productId);
        this.setDescription(description);
        this.setUnitPrice(unitPrice);
        this.setQtyOnHand(qtyOnHand);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "FoodTM{" +
                "productId='" + productId + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                '}';
    }
}
