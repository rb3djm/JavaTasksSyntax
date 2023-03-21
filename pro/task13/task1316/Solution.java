package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] enumArray=JavarushQuest.values();
        for(int i=0;i< enumArray.length;i++){
            System.out.println(enumArray[i].ordinal());
        }
    }
}
