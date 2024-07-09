package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Main {

	public static void main(String[] args) {
	
		// Interface
		/* Interface é um tipo que define um conjunto de operações que uma classe deve implementar.
		 * A interface estabelece um contrato que a classe deve cumprir.
		 * Interfaces servem para criar sistemas com baixo acoplamento e flexíveis. 
		 */
		
		// Exemplo de solução de problema, com interface.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		Vehicle vehicle = new Vehicle(carModel);
		
		CarRental cr = new CarRental(start, finish, vehicle);
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		BrazilTaxService taxBr = new BrazilTaxService();		
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, taxBr);
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento Básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento Total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
		
	}
}
