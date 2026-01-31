package chain_of_responsibility.handler.impl;

import chain_of_responsibility.handler.AbstractApprovalHandler;
import chain_of_responsibility.model.PurchaseOrder;

public class FinalizeHandler extends AbstractApprovalHandler {

    @Override
    protected boolean process(PurchaseOrder order) {
        if (!order.isApproved()) {
            System.out.println("[Finalize] No approval found. Rejecting.");
            order.reject("System");
        } else {
            System.out.println("[Finalize] Order completed.");
        }
        return false; // end chain
    }
}