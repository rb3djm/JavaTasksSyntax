package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        array=new int[num];
        int max=Integer.MIN_VALUE;
        int count=0;
        while(count< array.length){
            array[count]= scn.nextInt();
            count++;
        }
        for (int number:array){
            if (number>max){
                max=number;
            }
        }
        System.out.println(max);
    }
}
