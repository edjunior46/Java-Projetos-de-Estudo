package contractServices;

import entities.Contract;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contract contract, int months) {
        for (int i = 0; i < months; i++) {
            contract.addInstallent(onlinePaymentService.interest(contract.getTotalValue() / months, i + 1), i + 1);
        }
    }

}
