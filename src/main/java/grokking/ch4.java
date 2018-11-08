package main.java.grokking;

import java.util.Arrays;

public class ch4 {
    public int sum(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public int max(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr[0] > arr[1]) {
            arr[1] = arr[0];
        }
        return max(Arrays.copyOfRange(arr,1, arr.length));
    }

    public static int maxdos(int[] list) {
        if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
        }

        int subMax = maxdos(Arrays.copyOfRange(list, 1, list.length));
        return list[0] > subMax ? list[0] : subMax;
    }
}

