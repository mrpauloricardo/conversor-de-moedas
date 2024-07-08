package br.com.alura.conversor.view;

import br.com.alura.conversor.model.ExchangeRateResponse;
import br.com.alura.conversor.service.ExchangeRateService;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final ExchangeRateService service = new ExchangeRateService();
    private final Scanner scanner;
    private final List<String> historyList;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.historyList = new ArrayList<>();
    }
    
    public void showMenu() {
        String firstCountry = "";
        String secondCountry = "";

        while(true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Converter Moedas");
            System.out.println("2. Histórico de conversões");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    while (true) {
                        SubMenu subMenu = new SubMenu(scanner);
                        String selectedCountry = subMenu.selectContinent();

                        if (selectedCountry == null) {
                            break;
                        } else if (!selectedCountry.isEmpty()) {
                            if (firstCountry.isEmpty()) {
                                firstCountry = selectedCountry;
                                System.out.println("Moeda base selecionada: " + firstCountry);
                            } else {
                                if (selectedCountry.equals(firstCountry)) {
                                    System.out.println("Você não pode selecionar a mesma moeda para conversão. Escolha outra moeda.");
                                } else {
                                    secondCountry = selectedCountry;
                                    System.out.println("Moeda de destino selecionada: " + secondCountry);
                                    conversion(firstCountry, secondCountry);
                                    firstCountry = "";
                                    secondCountry = "";
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    history();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private void conversion(String firstCountry, String secondCountry) {
        System.out.print("Digite o valor a ser convertido: ");
        double value = scanner.nextDouble();

        try {
            ExchangeRateResponse response = service.getExchangeRates(firstCountry);
            Double rate = response.getRates().get(secondCountry);

            if (rate != null) {
                double convertedValue = value * rate;
                String conversion = String.format("%.2f %s equivalem a %.2f %s\n", value, firstCountry, convertedValue, secondCountry);
                System.out.print(conversion);
                historyList.add(conversion);
            } else {
                System.out.println("Moeda de destino não encontrada.");
            }
        } catch (IOException | URISyntaxException e) {
            System.out.println("Erro ao obter as taxas de câmbio: " + e.getMessage());
        }
    }

    private void history() {
        if (historyList.isEmpty()) {
            System.out.println("Nenhuma conversão realizada.");
        } else {
            System.out.println("\n--- Histórico de Conversões ---");
            for (int i = 0; i < historyList.size(); i++) {
                System.out.println((i + 1) + ". " + historyList.get(i));
            }
        }
    }
}