package by.epam.homework.task1;


import static java.lang.System.out;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("ПРОГРАММА КАЛЬКУЛЯТОР ЗАПУЩЕНА");
        out.println("\nВведите число и нажмите 'Enter':");
        while (!scanner.hasNextDouble()) {
            out.println("Ошибка: Введите число и нажмите 'Enter':");
            scanner.next();
        }
        double firstNumber = scanner.nextDouble();
        out.println("Введите нужную операцию: + - / * и нажмите 'Enter'");
        String operation = scanner.next();
        out.println("Введите число и нажмите 'Enter':");
        while (!scanner.hasNextDouble()) {
            out.println("Ошибка: Введите число и нажмите 'Enter':");
            scanner.next();
        }
        double secondNumber = scanner.nextDouble();
        if (operation.equals("+")) {
            out.println("Результат: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        } else if (operation.equals("-")) {
            out.println("Результат: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        } else if (operation.equals("*")) {
            out.println("Результат: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        } else if (operation.equals("/")) {
            out.println("Результат: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        } else {
            out.println("Ошибка: Пожалуйста, запустите программу заново и введите корректную требуемую операцию.");
        }
        out.println("\nПРОГРАММА КАЛЬКУЛЯТОР ЗАВЕРШИЛА РАБОТУ");

    }
}


