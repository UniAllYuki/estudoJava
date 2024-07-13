package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double baseValue = contract.getTotalValue() / months;
		
		for (int i=1;i<=months;i++) {
			LocalDate dueDate = contract.getPeriod().plusMonths(i);
			Double interest = baseValue + (onlinePaymentService.interest(baseValue, i));
			Double quota = interest + (onlinePaymentService.paymentFee(interest)); 
			
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
		
	}

	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	
	
}
