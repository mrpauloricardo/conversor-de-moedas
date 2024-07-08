package br.com.alura.conversor.view;

import java.util.Scanner;

public class SubMenu {
    private final Scanner scanner;

    public SubMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectContinent() {
        while (true) {
            printSubMenu();
            int continentOption = scanner.nextInt();
            scanner.nextLine();

            switch (continentOption) {
                case 1: return new Africa().selectCountry(scanner);
                case 2: return new AmericaNorte().selectCountry(scanner);
                case 3: return new AmericaSul().selectCountry(scanner);
                case 4: return new AmericaCentral().selectCountry(scanner);
                case 5: return new Asia().selectCountry(scanner);
                case 6: return new Europa().selectCountry(scanner);
                case 7: return new Oceania().selectCountry(scanner);
                case 8: return null;
                case 9:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    return null;
            }
        }
    }

    private void printSubMenu() {
        System.out.println("\n--- Selecione o continente da moeda a ser convertida: ---");
        System.out.println("1. África");
        System.out.println("2. América do Norte");
        System.out.println("3. América do Sul");
        System.out.println("4. América Central");
        System.out.println("5. Ásia");
        System.out.println("6. Europa");
        System.out.println("7. Oceania");
        System.out.println("8. Menu anterior");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
    }
}