package chain_of_responsibility.handler;

import chain_of_responsibility.handler.impl.Auditor;
import chain_of_responsibility.handler.impl.CTO;
import chain_of_responsibility.handler.impl.Manager;
import chain_of_responsibility.model.PurchaseOrder;

public abstract class BaseApprover {
    protected BaseApprover next;

    public void setNext(BaseApprover next) {
        this.next = next;
    }

    // The Template Method for handling the request
    public void processRequest(PurchaseOrder order) {
        approve(order);
        if (next != null) {
            next.processRequest(order);
        } else {
            // End of the chain
            order.setApproved(true);
            System.out.println(">>> Chain Complete. Final State: Approved.");
        }
    }

    // Abstract method for concrete logic
    protected abstract void approve(PurchaseOrder order);

    // Static helper to create the chain with "one call"
    public static BaseApprover getApprovalChain() {
        BaseApprover auditor = new Auditor();
        BaseApprover manager = new Manager();
        BaseApprover cto = new CTO();

        // Automatic chaining logic
        auditor.setNext(manager);
        manager.setNext(cto);

        return auditor;
    }
}