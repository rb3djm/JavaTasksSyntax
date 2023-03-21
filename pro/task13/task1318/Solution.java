package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] monthArray=Month.values();
        int number=month.ordinal();

        if (number==11){
            return Month.JANUARY;
        }

        return monthArray[number+1];
    }
}
