package com.homework1;

import java.util.Scanner;

public class CalculatorExample1 {
    public static void main(String[] args) {
        double number1;
        double number2;
        int oper;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:");
        number1 = scanner.nextDouble();
        System.out.println("Insert second number:");
        number2 = scanner.nextDouble();
        System.out.println("Insert number operation: 1-'+',2-'*'");
        oper = scanner.nextInt();
        Add add = new Add();
        Mult mult = new Mult();
        System.out.println("Iquals:");
        switch (oper) {
            case 1:
                System.out.println(add.calcul(number1, number2));
                break;
            case 2:
                System.out.println(mult.calcul(number1, number2));
                break;
            default:
                System.out.println("Illegal number operation");
                scanner.close();
        }
    }
}
