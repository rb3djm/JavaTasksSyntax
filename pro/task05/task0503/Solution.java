package com.javarush.task.pro.task05.task0503;

/* 
Работаем с элементами массива
*/

public class Solution {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        int count = 0;
        for (int num : array) {
            if (array[count]%2==0) {
                array[count] *= -1;
            }
            count++;
        }


        //напишите тут ваш код
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
