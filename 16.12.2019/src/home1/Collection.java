package home1;

import java.util.Arrays;

public class Collection {

    int[] array;
    int[] secondArray;

    public Collection(int[] array, int[] secondArray) {
        this.array = array;
        this.secondArray = secondArray;
    }

    firstClass firstClass = new firstClass();
    secondClass secondClass = new secondClass();


    public class firstClass implements Iterator {

        @Override
        public void hasNext() {

            boolean isSorted = false;
            int x;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;

                        x = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = x;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }

        @Override
        public void next() {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 1) {
                    array[i] = 0;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public class secondClass implements Iterator {

        @Override
        public void hasNext() {
            boolean isSorted = false;
            int x;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < secondArray.length - 1; i++) {
                    if (secondArray[i] < secondArray[i + 1]) {
                        isSorted = false;

                        x = secondArray[i];
                        secondArray[i] = secondArray[i + 1];
                        secondArray[i + 1] = x;
                    }
                }
            }
            System.out.println(Arrays.toString(secondArray));
        }

        @Override
        public void next() {
            System.out.print("[");
            for (int i = 0; i < secondArray.length; i++) {
                if (i % 2 == 0){
                    System.out.print(secondArray[i] + ", ");
                }
            }
            System.out.println("]");
        }
    }

}


