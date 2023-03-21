package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        array=new int[num];
        int min=Integer.MAX_VALUE;
        int count=0;
        while(count< array.length){
            array[count]= scn.nextInt();
            count++;
        }
        for (int number:array){
            if (number<min){
                min=number;
            }
        }
        System.out.println(min);
    }
}
