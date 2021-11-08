package com.homework3;

import java.util.Scanner;

public class CalculatorExample3 {
    int oper;
    private double number1;
    private double number2;

    // Создание внутренего класса
    public class Operation {
        public double operationAdd() {
            return number1 + number2;
        }

        public double operationMult() {
            return number1 * number2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorExample3 calculatorExample3 = new CalculatorExample3();
        Operation operation1 = calculatorExample3.new Operation();
        operation1.operationAdd();
        System.out.println("Insert first number:");
        calculatorExample3.number1 = scanner.nextDouble();
        System.out.println("Insert second number:");
        calculatorExample3.number2 = scanner.nextDouble();
        System.out.println("Insert number operation: 1-'+',2-'*'");
        calculatorExample3.oper = scanner.nextInt();
        System.out.println("Iquals:");
        switch (calculatorExample3.oper) {
            case 1:
                System.out.println(operation1.operationAdd());
                break;
            case 2:
                System.out.println(operation1.operationMult());
                break;
            default:
                System.out.println("Illegal number operation");
                scanner.close();
        }
    }
}
