package com.startjava.Lesson_2_3.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private String sign;
    private int result;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case "+" :
                result = number1 + number2;
                break;
            case "-" :
                result = number1 - number2;
                break;
            case "*" :
                result = number1 * number2;
                break;
            case "/" :
                result = number1 / number2;
                break;
            case "^" :
                int exp = 1;
                for(int i = 0; i <= number2; i++) {
                    exp *= number1;
                }
                result = exp;
                break;
            case "%" :
                result = number1 % number2;
                break;
            default :
                System.out.println("Операция не определена");
        }
        return result;
    }
}