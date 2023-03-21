package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();

        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int temp=Integer.MAX_VALUE;
        for (int i=0;i< ints.length;i++){
            temp=Math.min(ints[i],temp);
        }
        return temp;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scan=new Scanner(System.in);
        int []arr=new int[10];
        for (int i=0;i<10;i++){
            arr[i]= scan.nextInt();
        }
        return arr;
    }
}
