package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		
		// Mostrar diversas TimeZones
				/* for (String s : ZoneId.getAvailableZoneIds()) {		
					System.out.println(s);
				}
				*/
		// Convertendo horas

		LocalDate d01 = LocalDate.parse("2024-08-18");
		LocalDateTime d02 = LocalDateTime.parse("2024-08-18T01:51:30");
		Instant d03 = Instant.parse("2024-08-18T01:51:30Z");

		LocalDateTime r1 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		// Obter dados de uma data-hora local
		
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 mês = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 hora = " + d02.getMinute());
		System.out.println("d02 hora = " + d02.getSecond());
		
		// .
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		
		
	}

}
