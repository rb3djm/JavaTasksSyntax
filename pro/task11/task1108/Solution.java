package com.javarush.task.pro.task11.task1108;

/* 
Утильный калькулятор
*/

public class Solution {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {

        int a = 45;
        int b = 15;
        calculator.add(a, b);
        calculator.subtract(a, b);
        calculator.multiply(a, b);
        calculator.divide(a, b);
    }


    public static class calculator{
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }
        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }


}
