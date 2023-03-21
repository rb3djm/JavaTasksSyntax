package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size; //в нем хранится количество заполненных элементов, начальное значение — 0.

    private int capacity;//вместимость в текущем массиве (elements) данных,
    // которая будет увеличиваться по ходу добавления данных.

    private String[] elements; //это массив текущих элементов
    // (в похожем массиве хранит значения ArrayList)

    public CustomStringArrayList() {
        size = 0;
        capacity = 10;
        elements = new String[capacity];
    }

    public void add(String element) { //Когда массив заполнен (size == capacity),
        // вызывается метод grow() для расширения массива.
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {

//        capacity = (int) (capacity *  1.5);
//        String[] newElements = new String[capacity];
//        for (int i = 0; i < elements.length; i++) {
//            newElements[i] = elements[i];
//        }
//        elements = newElements;

        capacity = (int) (capacity * 1.5);
        String[] temp = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        elements = temp;

    }


/*Приватный метод grow(), который должен присвоить полю elements новый массив вместимостью (capacity)
 в полтора раза больше, чем у старого массива и скопировать данные из старого массива в новый в том же порядке.
  Поле capacity должно увеличиться точно так же, как и размер массива.*/
}
