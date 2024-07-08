package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Manipulando arquivos com File

		Scanner sc = new Scanner(System.in);
		
		// Mostrar Pastas
		
		System.out.println("Ender a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Mostrar Arquivos
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criar uma Sub-Pasta
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		
		System.out.println("Diretório criado com sucesso: " + success);
		
		sc.close();
	}

}
