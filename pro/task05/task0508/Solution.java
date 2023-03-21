package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int counter = 0;
        strings = new String[6];
        while (counter < 6) {
            strings[counter] = sca.nextLine();
            counter++;
        }

for (int i=0; i< strings.length;i++){
    String current=strings[i];
    for (int j=i+1;j< strings.length;j++){

        if (current==null){
            break;
        }
        else if(current.equals(strings[j])){
            strings[i]=null;
            strings[j]=null;
        }
    }
}


        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
