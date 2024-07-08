package br.com.alura.conversor.view;

import java.util.Scanner;

public class AmericaCentral {
    public String selectCountry(Scanner scanner) {
        while (true) {
            printAmericaCentralMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: return "CRC";
                case 2: return "CUP";
                case 3: return "HTG";
                case 4: return "HNL";
                case 5: return "NIO";
                case 6: return "PAB";
                case 7: return "";
                default: System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }

    private void printAmericaCentralMenu() {
        System.out.println("\n--- Selecione a moeda: ---");
        System.out.println("1. Costa Rica (Colón Costarriquenho - CRC)");
        System.out.println("2. Cuba (Peso Cubano - CUP)");
        System.out.println("3. Haiti (Gourde Haitiano - HTG)");
        System.out.println("4. Honduras (Lempira Hondurenha - HNL)");
        System.out.println("5. Nicarágua (Córdoba Nicaraguense - NIO)");
        System.out.println("6. Panamá (Balboa Panamenho - PAB)");
        System.out.println("7. Menu anterior");
        System.out.print("Escolha uma opção: ");
    }
}
