package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int[] x1 = Arrays.copyOf(array, 12);
        int[] x2 = null;
        int[] x3 = null;

        if (array.length % 2 != 0) {
            x2 = Arrays.copyOf(array, array.length / 2 + 1);
            x3 = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);

            result[0] = Arrays.copyOf(x2, x2.length);
            result[1] = Arrays.copyOf(x3, x3.length);

        } else {
            x2 = Arrays.copyOf(array, array.length / 2);
            x3 = Arrays.copyOfRange(array, array.length / 2, array.length);
            result[0] = Arrays.copyOf(x2, x2.length);
            result[1] = Arrays.copyOf(x3, x3.length);

        }


        //напишите тут ваш код
        System.out.println(Arrays.deepToString(result));
    }

}