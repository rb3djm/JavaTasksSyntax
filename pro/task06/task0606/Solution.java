package com.javarush.task.pro.task06.task0606;

/* 
Универсальный солдат
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void universalMethod(int number){
        System.out.println(number);

    }
    public static void universalMethod(String line){
        System.out.println(line);

    }

    public static void universalMethod(int number,String line){
        System.out.println(number+" "+line);

    }

    public static void universalMethod(int number,int lines){
        System.out.println(number+lines);

    }

    public static void universalMethod(int number,double x){
        System.out.println(number+x);

    }

    public static void universalMethod(double number,double line){
        System.out.println(number+line);

    }
    public static void universalMethod(long number){
        System.out.println(number);

    }

    public static void universalMethod(long number,double line){
        System.out.println(number+" "+line);

    }

    public static void universalMethod(long number,long line){
        System.out.println(number+" "+line);

    }

    public static void universalMethod(boolean xxx){
        System.out.println(xxx);

    }

}
