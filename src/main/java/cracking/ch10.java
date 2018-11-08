package main.java.cracking;

public class ch10 {

    // start at the beginning and compare with next element to the right
    public int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            // compare two elements
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap if
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
