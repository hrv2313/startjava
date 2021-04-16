package com.startjava.Lesson_1.app;

public class ConditionalStatement {
    public static void main(String[] args) {
        //создавай переменные максимально близко к месту их первого использования, не группируй их в начале метода
        int age = 31; 
        if(age > 20) {
            System.out.println("Возраст " + age + " > 20");
        }

        boolean isMaleGender = true;
        //вместо if (isMaleGender == true) пиши if (isMaleGender). Вместо if (isMaleGender != true) пиши if (!isMaleGender)
        if(isMaleGender) {
            System.out.println("Мужской пол");
        }
        if(!isMaleGender) {
            System.out.println("Женский пол");
        }

        double height = 1.72;
        if(height < 1.80) {
            System.out.println("Рост " + height + " < 1.80");
        } else {
            System.out.println("Рост " + height + " < 1.80");
        }

        char firstLetterName = 'R';
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени " + firstLetterName);
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}