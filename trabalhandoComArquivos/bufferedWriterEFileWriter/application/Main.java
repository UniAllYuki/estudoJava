package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		// FileWriter e BufferedWriter

		String[] lines = new String[] { "O povo não quer saber de", "cartucho de carambina, ", "o povo... ", "quer gozar~"};
		
		String path = "c:\\temp\\out.txt";		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
