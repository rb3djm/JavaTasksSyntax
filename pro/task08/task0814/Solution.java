package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        number=number|(1<<flagPos);
        //напишите тут ваш код
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        number=number&~(1<<flagPos);
        //напишите тут ваш код
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        if ((number&(1<<flagPos))==(1<<flagPos)){
            return true;
        }
        else{
        return false;}
    }
}
