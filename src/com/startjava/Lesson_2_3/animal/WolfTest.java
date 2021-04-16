package com.startjava.Lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] agrs) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("кобель");
        System.out.println("gender = " + wolfOne.getGender());
        wolfOne.setName("Бим");
        System.out.println("name = " + wolfOne.getName());
        wolfOne.setWeight(10);
        System.out.println("weight = " + wolfOne.getWeight());
        wolfOne.setAge(7);
        System.out.println("age = " + wolfOne.getAge());
        wolfOne.setColor("белый");
        System.out.println("color = " + wolfOne.getColor());

        System.out.println(wolfOne.go());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}