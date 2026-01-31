package chain_of_responsibility.model;

public class PurchaseOrder {
    private final String itemName;
    private final PurchaseLevel level;
    private boolean isApproved = false;

    public PurchaseOrder(String itemName, PurchaseLevel level) {
        this.itemName = itemName;
        this.level = level;
    }

    public String getItemName() { return itemName; }
    public PurchaseLevel getLevel() { return level; }
    public void setApproved(boolean approved) { isApproved = approved; }
    public boolean isApproved() { return isApproved; }

    @Override
    public String toString() {
        return String.format("Order[%s, Level: %s, Approved: %s]", itemName, level, isApproved);
    }
}