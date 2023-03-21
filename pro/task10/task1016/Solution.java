package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
      String a= city.getName();
      int b=city.getTemperature();
        System.out.println("В городе "+a+" сегодня температура воздуха "+b);

    }

    public static void main(String[] args) {
        City dubai=new City("Дубай",40);
        showWeather(dubai);
    }
}
