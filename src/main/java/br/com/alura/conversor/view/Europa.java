package br.com.alura.conversor.view;

import java.util.Scanner;

public class Europa {
    public String selectCountry(Scanner scanner) {
        while (true) {
            printEuropaMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: return "EUR";
                case 2: return "GBP";
                case 3: return "CHF";
                case 4: return "";
                default: System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }

    private void printEuropaMenu() {
        System.out.println("\n--- Selecione a moeda: ---");
        System.out.println("1. Diversos países europeus (Euro - EUR)");
        System.out.println("2. Inglaterra (Libra Esterlina - GBP)");
        System.out.println("3. Suíça (Franco Suíço - CHF)");
        System.out.println("4. Menu anterior");
        System.out.print("Escolha uma opção: ");
    }
}
