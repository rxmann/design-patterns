package chain_of_responsibility.handler.impl;

import chain_of_responsibility.handler.AbstractApprovalHandler;
import chain_of_responsibility.model.PurchaseOrder;

public class AuditorHandler extends AbstractApprovalHandler {

    @Override
    protected boolean process(PurchaseOrder order) {
        System.out.println("[Auditor] Auditing " + order.getItemName());
        return true; // always continue
    }
}
