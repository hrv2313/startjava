package com.startjava.Lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String continuation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player p1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player p2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(p1, p2);
        do {
            guessNumber.start();
            do {
                System.out.print("Хотите продолжить?[yes/no]: ");
                continuation = scanner.next();
            } while(!continuation.equals("yes") && !continuation.equals("no"));
        } while(continuation.equals("yes"));
    }
}