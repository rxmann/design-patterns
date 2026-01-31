package chain_of_responsibility;


import chain_of_responsibility.handler.BaseApprover;
import chain_of_responsibility.model.PurchaseLevel;
import chain_of_responsibility.model.PurchaseOrder;

/**
 * NOTES
 * Chain Of Responsibility
 * This is a behavioral design pattern that lets you pass requests along a chain of handlers. Each handler decide whether to process or pass the request to next handler in the chain.
*
 */
public class CoRTest {
    public static void main(String[] args) {
        // 1. Initialize the chain with a single call
        BaseApprover chain = BaseApprover.getApprovalChain();

        // 2. Create requests
        PurchaseOrder medOrder = new PurchaseOrder("New Laptops", PurchaseLevel.MEDIUM);
        PurchaseOrder highOrder = new PurchaseOrder("Mainframe Server", PurchaseLevel.HIGH);

        System.out.println("--- Processing Medium Order ---");
        chain.processRequest(medOrder);
        System.out.println(medOrder);

        System.out.println("\n--- Processing High Order ---");
        chain.processRequest(highOrder);
        System.out.println(highOrder);
    }
}
