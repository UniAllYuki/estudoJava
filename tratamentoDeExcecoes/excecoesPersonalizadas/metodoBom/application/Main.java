package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		
		// Criando Exceções Personalizadas		// Problema Exemplo;
		/* Fazer um programa para ler os dados de uma reserva de hotel (numéro do quarto, data
		 * de entrega e data de saída) e mostrar os dados da reserva, inclusive sua duranção em
		 * dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
		 * novamente a reserva com os dados atualizados. O Programa não deve aceitar dados
		 * inválidos para a reserva, conforme as regras a seguir:
		 * - Alterações de reserva só podem ocorrer para datas futuras.
		 * - A Data de saída deve ser maior que a data de entrada.
		 */
		
		// Solução "Boa"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// Aqui a diferença:
		try {
			System.out.print("Room Number: ");
			int number = sc.nextInt();
			System.out.print("Check-in Date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			// sdf.parse gera uma exceção, precisa ser tratada. Como no primeiro Catch
			System.out.print("Check-Out Date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation res = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + res);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in Date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out Date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
	
			// Retirado os If-Else e o throws ParseException.
			
			res.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + res);
		}
		catch (ParseException e) {
				 System.out.println("Invalid Date Format!");
		}
		catch (DomainException e) {
			// o "e" é o apelido da exceção, o getMessage é como pegar a mensagem da exceção.
			// Antes estava aqui o IllegalArgumentException, mas da para criar exceções personalizadas.
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e){
			// Esse serve para qualquer erro de input e etc
			System.out.println("Unexpected Error");
		}
		
		sc.close();
	}		
	
	// Essa é a versão Boa do projeto. Resumindo, para melhorar o código é só deixar ele mais bonito e organizado.
	
} 			