import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, 15000, Type.CONSUMABLES);
        manager.approve(2, 5000, Type.PC);
        manager.approve(3, 5000, Type.PC);
        manager.approve(4, 3000, Type.CLERICAL);
        manager.approve(5, 1000, Type.CLERICAL);
        manager.approve(6, -6300, Type.PC);
        manager.approve(7, 700, Type.CONSUMABLES);
        manager.approve(8, 4400, Type.GAMING);
        manager.approve(9, 1500, Type.GADGETS);
    }
}
