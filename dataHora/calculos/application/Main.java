package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		// Calculos com Data e Hora
		
		LocalDate d01 = LocalDate.parse("2024-08-18");
		LocalDateTime d02 = LocalDateTime.parse("2024-08-18T01:51:30");
		Instant d03 = Instant.parse("2024-08-18T01:51:30Z");

		LocalDate p01 = d01.minusDays(7);
		LocalDateTime p02 = d02.plusHours(7);
		Instant p03 = d03.minus(7, ChronoUnit.DAYS);
		
		System.out.println("d01 = " + d01);
		System.out.println("d01 1 semana atrás (p01) = " + p01);
		System.out.println("d02 daqui 7 horas (p02) = " + p02);
		System.out.println("d03 1 semana atrás(p03) = " + p03);
		
		// Duração entre duas horas
		
		Duration t1 = Duration.between(p02, d02);
		
		System.out.println("t1 = " + t1.toHours());
		
	}

}
