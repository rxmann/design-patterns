package chain_of_responsibility.handler.impl;

import chain_of_responsibility.handler.AbstractApprovalHandler;
import chain_of_responsibility.model.PurchaseOrder;

public class ValidationHandler extends AbstractApprovalHandler {

    @Override
    protected boolean process(PurchaseOrder order) {
        System.out.println("[Validation] Validating order");

        if (order.getItemName() == null || order.getItemName().isBlank()) {
            System.out.println("[Validation] Invalid order");
            order.reject("Validation");
            return false;
        }

        return true;
    }
}