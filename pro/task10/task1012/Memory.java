package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        memory=executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static String[] executeDefragmentation(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count++;
            }
        }
        String[] hashArray = new String[count];

        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                hashArray[count2]=array[i];
                count2++;

            }
        }
        return hashArray;
    }
}
