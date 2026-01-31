package chain_of_responsibility.handler;

import chain_of_responsibility.model.PurchaseOrder;

public abstract class AbstractApprovalHandler implements ApprovalHandler {

    protected ApprovalHandler next;

    @Override
    public void setNext(ApprovalHandler next) {
        this.next = next;
    }

    @Override
    public final void handle(PurchaseOrder order) {
        boolean shouldContinue = process(order);

        if (!shouldContinue) {
            return;
        }

        if (next != null) {
            next.handle(order);
        }
    }

    protected abstract boolean process(PurchaseOrder order);
}
