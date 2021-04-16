package com.startjava.Lesson_1.app;

public class Variable {
    public static void main(String[] args) {
        byte notebook = 1;
        short display = 2;
        int usb = 3;
        long ssd = 250;
        float cpu = 2.4f;
        double ram = 8.0d;
        char name = 'L';
        boolean monitor = true;

        System.out.println("Количество ноутбуков: " + notebook);
        System.out.println("Количество дисплеев: " + display);
        System.out.println("Количество usb портов: " + usb);
        System.out.println("Количество гигабайт ssd: " + ssd);
        System.out.println("Мощность CPU: " + cpu);
        System.out.println("Мощность OЗУ: " + ram);
        System.out.println("Первая буква названия ноутбука Lenovo: " + name);
        System.out.println("Есть ли монитор: " + monitor);
    }
}
//Проверка настройки GIT