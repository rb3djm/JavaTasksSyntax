package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = j+1;
            }
        }
        for (int i = 0; i < 10; i++) {

            for (int j=0;j<10;j++){
                int numB=MULTIPLICATION_TABLE[i][j]*MULTIPLICATION_TABLE[i][i];
                System.out.print(numB+" ");
            }
            System.out.println();
        }
    }
}