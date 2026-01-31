package chain_of_responsibility.handler;

import chain_of_responsibility.model.PurchaseOrder;

public interface ApprovalHandler {
    void setNext(ApprovalHandler next);
    void handle(PurchaseOrder order);
}
