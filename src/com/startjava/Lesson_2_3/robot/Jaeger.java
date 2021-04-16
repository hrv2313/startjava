package com.startjava.Lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private int kaijuKilled;
    private boolean armor;

    public Jaeger() {
        this.modelName = "";
        this.mark = "";
        this.kaijuKilled = 0;
        this.armor = false;
    }

    public Jaeger(String modelName, String mark, int kaijuKilled, boolean armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.kaijuKilled = kaijuKilled;
        this.armor = armor;
    }

    public void presentJaeger() {
        System.out.println("modelName : " + modelName + ", " + "mark : " + mark + ", " + "kaijuKilled : " + kaijuKilled);
    }

    public void haveArmor() {
        if(armor) {
            System.out.println("Kaiju имеет оружие");
        } else {
            System.out.println("Kaiju бесполезный");
        }
    }
}