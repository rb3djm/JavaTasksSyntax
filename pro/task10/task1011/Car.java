package com.javarush.task.pro.task10.task1011;

/*
Создаем свой hashCode
*/

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public boolean hashCode(Car car) {
        boolean checkYear = this.getYear() == car.year;
        char[] modelOut = car.getModel().toCharArray();
        char[] thisModel = this.getModel().toCharArray();

        if (thisModel[0] != modelOut[0] || thisModel.length != modelOut.length || !checkYear) {
            return false;
        } else {
            for (int i = 1; i < thisModel.length; i++) {
                if (thisModel[i] != modelOut[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);
        System.out.println(lamborghini.hashCode(lamborghini1));
    }
}
