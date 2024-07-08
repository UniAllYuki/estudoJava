package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Informações do caminho do Arquivo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		
		// Nome do Arquivo apenas, sem diretório.
		
		System.out.println("getName: " + path.getName());

		// O Contrário, só o diretório.
		
		System.out.println("getParent: " + path.getParent());
		
		// Pegando todo o caminho
		
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
