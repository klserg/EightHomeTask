package org.example.ui.menu;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Scanner;

@RequiredArgsConstructor
public class Menu {
    private final Scanner scanner;
    private final List<MenuItem> items;

    public void run() {
        while (true) {
            showMenu();
            int chooce = getChoice();
            if (chooce >= 0 && chooce < items.size()) {
                items.get(chooce).run();
                if (items.get(chooce).exit()) break;
            } else {
                System.out.println("Incorrect Input");
            }
        }
    }

    private int getChoice() {
        System.out.println("Enter your choice:");
        int ch =  scanner.nextInt()-1;
        scanner.nextLine();
        return ch;
    }

    private void showMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, items.get(i).getName());
        }
    }
}
