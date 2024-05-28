package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		// Criando Exceções Personalizadas		// Problema Exemplo;
		/* Fazer um programa para ler os dados de uma reserva de hotel (numéro do quarto, data
		 * de entrega e data de saída) e mostrar os dados da reserva, inclusive sua duranção em
		 * dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
		 * novamente a reserva com os dados atualizados. O Programa não deve aceitar dados
		 * inválidos para a reserva, conforme as regras a seguir:
		 * - Alterações de reserva só podem ocorrer para datas futuras.
		 * - A Data de saída deve ser maior que a data de entrada.
		 */
		
		// Solução "Ruim"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("Check-in Date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		// sdf.parse gera uma exceção, por isso precisa da declaração de throws ParseException.
		System.out.print("Check-Out Date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in Reservation: Check-out date must be after check-in date!");
			System.exit(0);
		}
		
		Reservation res = new Reservation(number, checkIn, checkOut);
		System.out.println("Reservation: " + res);
		
		System.out.println();
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in Date (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-Out Date (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
		
		// Delegação mudou para o Objeto, e agora retorna um String.
		String error = res.updateDates(checkIn, checkOut);
		if (error != null) {
				System.out.println("Error in reservation: " + error);
		} else {
			System.out.println("Reservation: " + res);
		}
		
		
		sc.close();
	}		
	
	// Essa é a versão Ruim do projeto.
	
} 			