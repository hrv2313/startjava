package com.startjava.Lesson_1.app;

public class Cycle {
    public static void main(String[] args) {
        System.out.println("Задание №1 - Выведите на консоль с помощью цикла for все числа от [0, 20]");
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Задание №2 - Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
        int counter = 6;
        while(counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }

        System.out.println("Задание №3 - Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");
        int sum = 0;
        counter = 10;
        do {
            counter++;
            if(counter % 2 != 0) {
                sum += counter;
            }
        } while(counter < 20);
        System.out.println(sum);
    }
}