package br.com.alura.conversor.view;

import java.util.Scanner;

public class Oceania {
    public String selectCountry(Scanner scanner) {
        while (true) {
            printOceaniaMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: return "AUD";
                case 2: return "FJD";
                case 3: return "NZD";
                case 4: return "";
                default: System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }

    private void printOceaniaMenu() {
        System.out.println("\n--- Selecione a moeda: ---");
        System.out.println("1. Austrália (Dólar Australiano - AUD)");
        System.out.println("2. Fiji (Dólar Fijiano - FJD)");
        System.out.println("3. Nova Zelândia (Dólar Neozelandês - NZD)");
        System.out.println("4. Menu anterior");
        System.out.print("Escolha uma opção: ");
    }
}
