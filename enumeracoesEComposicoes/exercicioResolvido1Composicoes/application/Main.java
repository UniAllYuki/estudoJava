package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		/* Composição
		 Composição é um tipo de associação que permite que um objeto contenha outro. 
		 Relação "tem-um" ou "tem-vários"
		*/
		// Exercício Resolvido 1:
		/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
		 * do usuário um mês e mostrar qual foi o salário do funcionário ensse mês.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter Worker Data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary =  sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter Month and Year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
			
		sc.close();
	}

	// Nota do Exercício Resolvido: Meu amigo, por que caralhos eu fui começar com Java '-'
	
}
