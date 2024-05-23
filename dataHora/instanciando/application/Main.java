package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
	
		// Instanciar LocalDate
		
		LocalDate d01 = LocalDate.now();
		
		// Instanciar LocalDateTime
		
		LocalDateTime d02 = LocalDateTime.now();
		
		// Instanciar Instant (Horario Global)
		
		Instant d03 = Instant.now();
		
		// Texto ISO 8601 -> Data-Hora
		
		LocalDate d04 = LocalDate.parse("2024-08-18");
		
		// Texto ISO 8601 -> Data-Hora
		
		LocalDateTime d05 = LocalDateTime.parse("2024-08-18T01:51:32");
		
		// Texto ISO 8601 -> Instant (Horario Global)
		
		Instant d06 = Instant.parse("2024-08-18T01:51:32Z");
		
		// Texto ISO 8601 -> Instant (Horario Global) Com Fuso Horario
		
		Instant d07 = Instant.parse("2024-08-18T01:51:32-03:00");
		
		// Texto com Formato Customizado (Errado)
		
		// LocalDate d08 = LocalDate.parse("18/08/2004");
		
		// Texto com Formato Costumizado (Google: java (versão) dateTimeFormatter) Ainda com formato ISO
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("18/08/2004", dtf1);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("18/08/2004 01:51", dtf2);
		
		// Instaciando Texto com parametros isolados
		
		LocalDate d10 = LocalDate.of(2024, 8, 18);
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 18, 01, 51);
		
		// Sysout d01 = Sysout d01.toString
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

	
}
