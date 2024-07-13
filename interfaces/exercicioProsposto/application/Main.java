package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Main {

	public static void main(String[] args) {
	
		// Exercício Proposto

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Digite os dados do contrato: ");
		System.out.print("Número: ");
		Integer number = sc.nextInt();		
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate period =  LocalDate.parse(sc.nextLine(), dtf);	
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Número de Parcelas: ");
		Integer installments = sc.nextInt();
		
		Contract contract = new Contract(number, period, totalValue);
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, installments);
		
		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		
		sc.close();
	}

}
