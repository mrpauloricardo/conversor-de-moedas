package br.com.alura.conversor.view;

import java.util.Scanner;

public class AmericaSul {
    public String selectCountry(Scanner scanner) {
        while (true) {
            printAmericaSulMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: return "ARS";
                case 2: return "BOB";
                case 3: return "BRL";
                case 4: return "PEN";
                case 5: return "UYU";
                case 6: return "VES";
                case 7: return "";
                default: System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }

    private void printAmericaSulMenu() {
        System.out.println("\n--- Selecione a moeda: ---");
        System.out.println("1. Argentina (Peso Argentino - ARS)");
        System.out.println("2. Bolívia (Boliviano - BOB)");
        System.out.println("3. Brasil (Real Brasileiro - BRL)");
        System.out.println("4. Peru (Novo Sol Peruano - PEN)");
        System.out.println("5. Uruguai (Peso Uruguaio - UYU)");
        System.out.println("6. Venezuela (Bolívar Venezuelano - VES)");
        System.out.println("7. Menu anterior");
        System.out.print("Escolha uma opção: ");
    }
}