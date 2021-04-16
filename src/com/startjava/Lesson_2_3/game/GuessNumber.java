package com.startjava.Lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hiddeNumber = random.nextInt(101);
        do {
            System.out.print("Первый игрок загадал число: ");
            p1.setNumber(scanner.nextInt());
            if(hiddeNumber == p1.getNumber()) {
                System.out.println("Первый игрок угадал число загаданное компьютером");
                break;
            } else if(hiddeNumber > p1.getNumber()) {
                System.out.println("Загаданное компьютером число больше того, что загадал первый игрок");
            } else if(hiddeNumber < p1.getNumber()) {
                System.out.println("Загаданное компьютером число меньше того, что загадал первый игрок");
            }

            System.out.print("Второй игрок загадал число: ");
            p2.setNumber(scanner.nextInt());
            if(hiddeNumber == p2.getNumber()) {
                System.out.println("Второй игрок угадал число загаданное компьютером");
                break;
            } else if(hiddeNumber > p2.getNumber()) {
                System.out.println("Загаданное число компьютером больше того, что загадал второй игрок");
            } else if(hiddeNumber < p2.getNumber()) {
                System.out.println("Загаданное число компьютером меньше того, что загадал второй игрок");
            }

            if(hiddeNumber != p1.getNumber() || hiddeNumber != p2.getNumber()) {
                System.out.println("Не один из игроков не угадал число загаданное компьютером");
            }
            System.out.println("Загаданное число компьютером: " + hiddeNumber); //Для проверки
        } while(true);
    }
}