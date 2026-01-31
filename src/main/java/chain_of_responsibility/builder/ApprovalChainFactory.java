package chain_of_responsibility.builder;

import chain_of_responsibility.handler.ApprovalHandler;
import chain_of_responsibility.handler.impl.*;

public class ApprovalChainFactory {

    public static ApprovalHandler createChain() {
        ApprovalHandler auditor = new AuditorHandler();
        ApprovalHandler validation = new ValidationHandler();
        ApprovalHandler manager = new ManagerHandler();
        ApprovalHandler cto = new CTOHandler();
        ApprovalHandler finalize = new FinalizeHandler();

        auditor.setNext(validation);
        validation.setNext(manager);
        manager.setNext(cto);
        cto.setNext(finalize);

        return auditor;
    }
}