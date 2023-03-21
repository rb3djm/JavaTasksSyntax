package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
int lineSum;
        for (int i=9; i>-1;i--){
            lineSum=0;
            result[i]=new int [i+1];
            for (int j=0;j<i+1;j++){
                result[i][j]=j;


            }
            System.out.println(result[i]);

        }
        //напишите тут ваш код
    }
}
