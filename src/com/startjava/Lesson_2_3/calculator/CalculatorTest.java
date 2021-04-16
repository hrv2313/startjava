package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String proceed;
        do { 
            System.out.print("Введите первое число: ");
            calcOne.setNumber1(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calcOne.setSign(scanner.next());
            System.out.print("Введите второе число: ");
            calcOne.setNumber2(scanner.nextInt());
            System.out.println("Результат: " + calcOne.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                proceed = scanner.next();
                } while(!proceed.equals("yes") && !proceed.equals("no"));
        } while(proceed.equals("yes"));
    }
}