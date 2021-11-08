package com.homework2;

import java.util.Scanner;

public class CalculatorExample2 {
    public static void main(String[] args) {
        double number1;
        double number2;
        int operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:");
        number1 = scanner.nextDouble();
        System.out.println("Insert second number:");
        number2 = scanner.nextDouble();
        System.out.println("Insert number operation: 1-'+',2-'*'");
        operation = scanner.nextInt();
        System.out.println("Iquals:");
        switch (operation) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Illegal number operation");
                scanner.close();
        }
    }
}
