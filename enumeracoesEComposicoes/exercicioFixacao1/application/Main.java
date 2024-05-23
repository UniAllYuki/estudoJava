package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		// Exercício de Fixação. (Tive que, lá na metade, resolver junto com o prof.)
		
		/* Ler os dados de um pedido com N items (N fornecido pelo usuário). Depois, mostrar um
		 * sumário do pedido. Nota: o instante do pedido dever o instante do sistema: new Date();
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());		
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println();
		System.out.print("How Many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n;i++) {
			System.out.println();
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product Name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(pName, pPrice);
			OrderItem it = new OrderItem(quantity, pPrice, product);		
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

	// sei nem o que dizer.
	
}
