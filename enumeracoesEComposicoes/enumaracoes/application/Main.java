package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
	
		// Enumerações
		 /*
		  -> É um tipo espcial que serve para especificar de forma literal um conjunto de constantes relacionadas.
		  -> Palavra chave em JAVA: enum
		 */
		// Criar a enum é tipo criar uma CLASSE. 
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		// Conversão de String para enum
		 /*
		 OrderStatus os1 = OrderStatus.DELIVERED; 
		 OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		 */
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}
}
