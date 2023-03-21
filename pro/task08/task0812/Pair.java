package com.javarush.task.pro.task08.task0812;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        int hash=this.x;
        this.x=0;
        this.x=this.x|this.y;
        this.y=hash;
        //напишите тут ваш код
    }
}
