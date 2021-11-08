package com.homework5;

import java.util.Scanner;

public class CalculatorExample5 {
    /**
     * Класс Calculator рассчитывает сумму или произведение двух введенных чисел
     * @ Костя
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperationExample5 operationExample5;
        System.out.println("Insert number operation: 1-'+',2-'*'");
        int operation = scanner.nextInt();
        System.out.println("Insert first number then second number: ");
        // Далее блок кода с лямбда-выражениями
        switch (operation) {
            case 1:
               operationExample5 = ((number1, number2) -> number1 + number2);
                double result = operationExample5.calcul(scanner.nextDouble(), scanner.nextDouble());
                System.out.println(result);
                break;
            case 2:
               operationExample5 = ((number1, number2) -> number1 * number2);
                double result2 = operationExample5.calcul(scanner.nextDouble(), scanner.nextDouble());
                System.out.println(result2);
                break;
            default:
                System.out.println("Illegal number operation");

                scanner.close();
        }
    }
}