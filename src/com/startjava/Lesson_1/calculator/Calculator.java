package com.startjava.Lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 3;
        char sign = '*';
        if(sign == '+') {
            System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
        } else if(sign == '-') {
            System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
        } else if (sign == '*') {
            System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
        } else if (sign == '/') {
            System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
        } else if (sign == '^') {
            int exponentiation = 1;
            for(int i = 0; i <= number2; i++) {
                exponentiation *= number1;
            }
            System.out.println(number1 + " в степени " + number2 + "=" + (exponentiation));
        } else if (sign == '%') {
            System.out.println(number1 + "%" + number2 + "=" + (number1 % number2));
        } else {
            System.out.println("Операция не определена");
        }
    }
}