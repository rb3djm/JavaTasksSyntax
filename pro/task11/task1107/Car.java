package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {

    Engine engine=new Engine();


    //напишите тут ваш код
class Engine{

    private boolean isRunning;

    public void start(){
        this.isRunning=true;
    }

    public void stop(){
        this.isRunning=false;
    }

    }

}
