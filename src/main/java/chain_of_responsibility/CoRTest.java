package chain_of_responsibility;

import chain_of_responsibility.builder.ApprovalChainFactory;
import chain_of_responsibility.handler.ApprovalHandler;
import chain_of_responsibility.model.PurchaseLevel;
import chain_of_responsibility.model.PurchaseOrder;

public class CoRTest {
    public static void main(String[] args) {
        ApprovalHandler chain = ApprovalChainFactory.createChain();

        PurchaseOrder med = new PurchaseOrder("Laptops", PurchaseLevel.MEDIUM);
        PurchaseOrder high = new PurchaseOrder("Server", PurchaseLevel.HIGH);
        PurchaseOrder low = new PurchaseOrder("pipe", PurchaseLevel.LOW);

        System.out.println("\n--- LOW ---");
        chain.handle(low);
        System.out.println(low);

        System.out.println("\n--- MEDIUM ---");
        chain.handle(med);
        System.out.println(med);

        System.out.println("\n--- HIGH ---");
        chain.handle(high);
        System.out.println(high);
    }
}
