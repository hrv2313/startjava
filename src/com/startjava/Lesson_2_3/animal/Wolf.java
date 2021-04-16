package com.startjava.Lesson_2_3.animal;

public class Wolf {
    private String gender;
    private String name;
    private int weight;
    private int age = 2;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String go() {
        return "идти";
    }

    public String sit() {
        return "сидеть";
    }

    public String run() {
        return "бежать";
    }

    public String howl() {
        return "выть";
    }

    public String hunt() {
        return "охотиться";
    }
}