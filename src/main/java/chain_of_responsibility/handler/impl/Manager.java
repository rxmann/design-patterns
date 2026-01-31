package chain_of_responsibility.handler.impl;

import chain_of_responsibility.handler.BaseApprover;
import chain_of_responsibility.model.PurchaseLevel;
import chain_of_responsibility.model.PurchaseOrder;

public class Manager extends BaseApprover {
    @Override
    protected void approve(PurchaseOrder order) {
        if (order.getLevel() == PurchaseLevel.MEDIUM || order.getLevel() == PurchaseLevel.HIGH) {
            System.out.println("[Manager]: Budget approved for " + order.getItemName());
        }
    }
}