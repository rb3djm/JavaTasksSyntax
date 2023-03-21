package com.javarush.task.pro.task10.task1015;

/* 
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Hedgehog hadgehog=new Hedgehog();
        Apple apple =new Apple();
        hadgehog.eat(apple);
        //напишите тут ваш код
    }


    public static class Apple {
    }
}
