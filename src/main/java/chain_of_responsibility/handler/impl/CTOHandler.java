package chain_of_responsibility.handler.impl;

import chain_of_responsibility.handler.AbstractApprovalHandler;
import chain_of_responsibility.model.PurchaseLevel;
import chain_of_responsibility.model.PurchaseOrder;

public class CTOHandler extends AbstractApprovalHandler {

    @Override
    protected boolean process(PurchaseOrder order) {
        if (order.getLevel() == PurchaseLevel.HIGH) {
            System.out.println("[CTO] Approved " + order.getItemName());
            order.approve();
        }
        return true;
    }
}
