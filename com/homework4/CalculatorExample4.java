package com.homework4;

import java.util.Scanner;

public class CalculatorExample4 {
    /**
     * Класс Calculator рассчитывает сумму или произведение двух введенных чисел
     *
     * @param args
     * @ Костя
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number operation: 1-'+',2-'*'");
        int operation = scanner.nextInt();
        System.out.println("Insert first number then second number: ");

        // Далее анонимный класс
        OperationExample4 operationExample4 = new OperationExample4() {
            @Override
            public double calculate(double number1, double number2) {
                return number1 + number2;
            }
        };

        switch (operation) {
            case 1:
            double result1 = operationExample4.calculate(scanner.nextDouble(), scanner.nextDouble());
                System.out.println(result1);
                break;
            case 2:
            double result2 = operationExample4.calculate(scanner.nextDouble(), scanner.nextDouble());
                System.out.println(result2);
                break;
            default:
                System.out.println("Illegal number operation");

                scanner.close();
        }
    }

    public interface OperationExample4 {
        double calculate(double number1, double number2);
    }
}