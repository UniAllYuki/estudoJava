package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Lendo um arquivo texto com classes File e Scanner
		/* File - Representação abstrata de um arquivo e seu caminho
		 * Scanner - Leitor de Texto
		 * IOException (Exception)
		 */
		
		// Esse processo meio que pega o arquivo.
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		//Tem que colocar em Try por causa da IOException
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}	
	}

}
