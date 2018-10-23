package main.java.dailycoding;

public class problem_18 {

    //[10, 5, 2, 7, 8, 7] index = 5
    //k = 3
    public void tryOne(int[] arr, int k) {
        if (k < 1 || k > arr.length) throw new IllegalArgumentException("k is less than 1 or greater than array index");
        int max;

        for (var i = 0; i <= arr.length - k; i++) {
            max = arr[i];
            for (var j = 1; j < k; j++) {
                if (arr[i + j] > max) max = arr[j + i];
            }
            System.out.println(max);
        }
    }
}
