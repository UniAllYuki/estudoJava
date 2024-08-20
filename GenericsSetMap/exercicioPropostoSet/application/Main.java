package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Main {

	public static void main(String[] args) {
	
		// Exerício Proposto de Set (Alunos em cursos) (Até que foi bem fácil)
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("Quantos estudantes para o curso A?");
		int a = sc.nextInt();
		
		for (int i = 0; i<a ; i++ ) {
			Integer ID = sc.nextInt();
			set.add(new Student(ID));
		}
		
		System.out.print("Quantos estudantes para o curso B?");
		int b = sc.nextInt();
		
		for (int i = 0; i<b ; i++ ) {
			Integer ID = sc.nextInt();
			set.add(new Student(ID));
		}
		
		System.out.print("Quantos estudantes para o curso C?");
		int c = sc.nextInt();
		
		for (int i = 0; i<c ; i++ ) {
			Integer ID = sc.nextInt();
			set.add(new Student(ID));
		}
		
		System.out.println("Quantidade total de Estudantes: " + set.size());
		
		
		
		sc.close();
	}

}
