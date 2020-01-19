package home;

import java.util.Arrays;

public class MyArrayList {

    private Integer[] arr;
    private int size = 0;

    public MyArrayList() {
        arr = new Integer[10];
    }
//Заповнення масиву
    public void add(Integer i) {
        if (size + 1 > arr.length) {
            Integer[] newArr = Arrays.copyOf(arr, (int) (arr.length * 1.5));
            arr = newArr;
            arr[size] = i;
            size++;
        } else {
            arr[size] = i;
            size++;
        }
    }
//Отримання певного значення в масиві.
    public int get(int e){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(e)){
                System.out.println(e);
                break;
            }
        }
        return 0;
    }
//Перевірка чи є певний елемент в масиві.
    public boolean contains(int e){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(e)){
                return true;
            }
        }
        return false;
    }
//Сортування масиву по зростанню.
    public void sort(){
        for (int i = 0; i < arr.length - 1; i++ ){
            if (arr[i + 1] != null) {
                if (arr[i] > arr[i + 1]) {
                    int num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

//Вивід масиву.
    public void printCollection() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
}

