package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете име: ");
        String name = scanner.nextLine();
        System.out.print("Въведете хоби: ");
        String hobby = scanner.nextLine();
        System.out.printf("Аз съм %s и съм страстен %s.%n", name, hobby);
    }
}