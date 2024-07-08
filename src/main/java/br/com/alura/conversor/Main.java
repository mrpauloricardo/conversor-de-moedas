package br.com.alura.conversor;

import br.com.alura.conversor.view.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.showMenu();
    }
}