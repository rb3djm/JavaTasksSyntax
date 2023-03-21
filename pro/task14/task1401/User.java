package com.javarush.task.pro.task14.task1401;

import java.util.Objects;

public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name == null) {
            return -1;
        } else if (name.isEmpty()) {
            return -2;
        } else if (name.matches(".*\\d.*")) {
            return -3;
        } else {
            this.name = name;
            return 0;
        }
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0) {
            return -1;
        } else if (age > 150) {
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {          //почему не instanceof ?
            return true;
        }
        if (!(o instanceof User)) { //правильно ли я понимаю выражение, если в скобках false , значит return false
            return false;
        }
        User user = (User) o;    //что происходит тут?
        return Objects.equals(getName(), user.getName()); //и тут ? Как класс Object сравнивается с полями класса User?
                                                          // да еще и equals получает на вход 2 аргумента.
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
