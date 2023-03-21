package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] winter(){
        List<Month> months=new ArrayList<>();
        Collections.addAll(months,Month.values());
        Month[]winter={months.get(11),months.get(0),months.get(1)};
        return winter;
    }

}
class Test{
    public static void main(String[] args) {
        System.out.println(Month.winter());
    }


}
