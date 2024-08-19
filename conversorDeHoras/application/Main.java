package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define os formatos de data
        SimpleDateFormat brFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        SimpleDateFormat enFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        SimpleDateFormat interFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault());

        System.out.println("Entre com a data e seu formato (BR, EN, INT)");
        System.out.println();

        try {
            // Lê a data e o formato
            System.out.print("Data: ");
            String dateString = sc.nextLine();
            
            System.out.print("Formato (BR, EN, INT): ");
            String format = sc.nextLine().trim().toUpperCase();

            SimpleDateFormat selectedFormat = null;

            // Seleciona o formato com base na entrada do usuário
            switch (format) {
                case "BR":
                    selectedFormat = brFormat;
                    break;
                case "EN":
                    selectedFormat = enFormat;
                    break;
                case "INT":
                    selectedFormat = interFormat;
                    break;
                default:
                    System.out.println("Formato inválido.");
                    sc.close();
                    return;
            }

            // Configura o formato selecionado para não aceitar datas lenientes
            selectedFormat.setLenient(false);
            Date date = selectedFormat.parse(dateString);

            // Imprime a data no formato selecionado e nos formatos relevantes
            switch (format) {
                case "BR":
                    System.out.println("Data no formato BR: " + brFormat.format(date));
                    System.out.println("Data no formato EN: " + enFormat.format(date));
                    System.out.println("Data no formato INT: " + interFormat.format(date));
                    break;
                case "EN":
                    System.out.println("Data no formato EN: " + enFormat.format(date));
                    System.out.println("Data no formato BR: " + brFormat.format(date));
                    System.out.println("Data no formato INT: " + interFormat.format(date));
                    break;
                case "INT":
                    System.out.println("Data no formato INT: " + interFormat.format(date));
                    System.out.println("Data no formato BR: " + brFormat.format(date));
                    System.out.println("Data no formato EN: " + enFormat.format(date));
                    break;
            }
            
        } catch (ParseException e) {
            System.out.println("Data inválida ou formato incorreto.");
        }

        sc.close();
    }
}
