package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger minotavr = new Jaeger();
        String nickname = "Minotavr";
        minotavr.setNickname(nickname);

        String mark = "m-123";
        minotavr.setMark(mark);

        int height = 5;
        minotavr.setHeight(height);

        int weight = 40;
        minotavr.setWeight(weight);

        int speed = 10;
        minotavr.setSpeed(speed);

        int strenght = 50;
        minotavr.setStrength(strenght);

        int armor = 20;
        minotavr.setArmor(armor);

        System.out.println("Его имя: " + minotavr.getNickname() + 
                ", его марка: " + minotavr.getMark());
        
        minotavr.guard();
        minotavr.go();

        Jaeger scout = new Jaeger("Scout", "m-222", 4, 30, 25, 30, 10);
        System.out.println("Его имя: " + scout.getNickname() + 
                ", его марка: " + scout.getMark());

        scout.hide();
        scout.run();
        scout.attack();

        scout.countRobots();
    }
}