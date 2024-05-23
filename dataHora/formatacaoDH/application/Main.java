package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		// Formatação Data-Hora
		
		LocalDate d01 = LocalDate.parse("2024-08-18");
		LocalDateTime d02 = LocalDateTime.parse("2024-08-18T01:51:30");
		Instant d03 = Instant.parse("2024-08-18T04:51:30Z");
		
		// Formatando o horario com DateTimeFormatter
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// Formatando horario global ^
		
		System.out.println("d01 = " + d01.format(dtf1));
		//ou
		System.out.println("d01 = " + dtf1.format(d01));
		//ou 
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d02 = " + d02.format(dtf2));
		//ou
		System.out.println("d02 = " + dtf2.format(d02));
		//ou 
		System.out.println("d02 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	
		// Não tem como: System.out.println("d03 = " + d03.format(dtf3));
		
		System.out.println("d03 = " + dtf3.format(d03));
		
	}

}
