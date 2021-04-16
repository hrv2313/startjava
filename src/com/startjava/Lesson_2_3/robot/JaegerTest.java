package com.startjava.Lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Brawler Yukon", "Mark-1", 2, true);
        jaegerOne.presentJaeger();
        jaegerOne.haveArmor();
        Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", 11, false);
        jaegerTwo.presentJaeger();
        jaegerTwo.haveArmor();
        Jaeger jaegerThree = new Jaeger();
        jaegerThree.presentJaeger();
    }
}