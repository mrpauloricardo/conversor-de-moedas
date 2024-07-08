package br.com.alura.conversor.view;

import java.util.Scanner;

public class Asia {
    public String selectCountry(Scanner scanner) {
        while (true) {
            printAsiaMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: return "BHD";
                case 2: return "AED";
                case 3: return "JOD";
                case 4: return "KWD";
                case 5: return "SGD";
                case 6: return "OMR";
                case 7: return "";
                default: System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }

    private void printAsiaMenu() {
        System.out.println("\n--- Selecione a moeda: ---");
        System.out.println("1. Bahrein (Dinar do Bahrein - BHD)");
        System.out.println("2. Emirados Árabes Unidos (Dirham dos Emirados - AED)");
        System.out.println("3. Jordânia (Dinar Jordaniano - JOD)");
        System.out.println("4. Kuwait (Dinar Kuwaitiano - KWD)");
        System.out.println("5. Singapura (Dólar de Singapura - SGD)");
        System.out.println("6. Omã (Rial Omanense - OMR)");
        System.out.println("7. Menu anterior");
        System.out.print("Escolha uma opção: ");
    }
}
