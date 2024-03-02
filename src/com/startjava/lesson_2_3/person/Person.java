package com.startjava.lesson_2_3.person;

public class Person {
    
    String sex = "Мужской";
    String name = "Иван";
    int height = 183;
    int weight = 70;
    int age = 20;

    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void speak() {
        System.out.println("Говорит");
    }
}