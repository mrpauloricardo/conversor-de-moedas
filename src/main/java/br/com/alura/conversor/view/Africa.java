package br.com.alura.conversor.view;

import java.util.Scanner;

public class Africa {
    public String selectCountry(Scanner scanner) {
        while (true) {
            printAfricaMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: return "ZAR";
                case 2: return "EGP";
                case 3: return "GHS";
                case 4: return "MAD";
                case 5: return "TND";
                case 6: return "ZMW";
                case 7: return "";
                default: System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }

    private void printAfricaMenu() {
        System.out.println("\n--- Selecione a moeda: ---");
        System.out.println("1. África do Sul (Rand Sul-Africano - ZAR)");
        System.out.println("2. Egito (Libra Egípcia - EGP)");
        System.out.println("3. Gana (Cedi Ganês - GHS)");
        System.out.println("4. Marrocos (Dirham Marroquino - MAD)");
        System.out.println("5. Tunísia (Dinar Tunisiano - TND)");
        System.out.println("6. Zâmbia (Kwacha Zambiana - ZMW)");
        System.out.println("7. Menu anterior");
        System.out.print("Escolha uma opção: ");
    }
}
