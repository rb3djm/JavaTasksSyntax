package com.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Выводим в консоли элементы множества
*/

public class Solution {

    public static void print(HashSet<String> words) {
        Iterator<String>show= words.iterator();
        while (show.hasNext()){
            System.out.println(show.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
