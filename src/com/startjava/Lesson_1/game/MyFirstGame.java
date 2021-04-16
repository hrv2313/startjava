package com.startjava.Lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 10;
        int myNumber = 0;
        do {
            if(myNumber < hiddenNumber) {
                System.out.println("Введенное вами число " + myNumber + " меньше того, что загадал компьютер " + hiddenNumber);
                myNumber++;
            } else if(myNumber > hiddenNumber) {
                System.out.println("Введенное вами число " + myNumber + " больше того, что загадал компьютер " + hiddenNumber);
                myNumber--;
            }
        } while(myNumber != hiddenNumber);
        System.out.println("Вы угадали загаданное число " + hiddenNumber);
    }
}