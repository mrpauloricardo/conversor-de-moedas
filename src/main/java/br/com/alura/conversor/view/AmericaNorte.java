package br.com.alura.conversor.view;

import java.util.Scanner;

public class AmericaNorte {
    public String selectCountry(Scanner scanner) {
        while (true) {
            printAmericaNorteMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: return "CAD";
                case 2: return "USD";
                case 3: return "MXN";
                case 4: return "";
                default: System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }

    private void printAmericaNorteMenu() {
        System.out.println("\n--- Selecione a moeda: ---");
        System.out.println("1. Canadá (Dólar Canadense - CAD)");
        System.out.println("2. Estados Unidos (Dólar Americano - USD)");
        System.out.println("3. México (Peso Mexicano - MXN)");
        System.out.println("4. Menu anterior");
        System.out.print("Escolha uma opção: ");
    }
}
