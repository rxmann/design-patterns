package chain_of_responsibility.model;

public class PurchaseOrder {
    private final String itemName;
    private final PurchaseLevel level;
    private boolean approved;
    private String rejectedBy;

    public PurchaseOrder(String itemName, PurchaseLevel level) {
        this.itemName = itemName;
        this.level = level;
    }

    public String getItemName() {
        return itemName;
    }

    public PurchaseLevel getLevel() {
        return level;
    }

    public boolean isApproved() {
        return approved;
    }

    public void approve() {
        this.approved = true;
    }

    public void reject(String by) {
        this.approved = false;
        this.rejectedBy = by;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + itemName + '\'' +
                ", level=" + level +
                ", approved=" + approved +
                ", rejectedBy='" + rejectedBy + '\'' +
                '}';
    }
}
