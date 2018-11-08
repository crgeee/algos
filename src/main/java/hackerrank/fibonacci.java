package main.java.hackerrank;

public class fibonacci {

    public int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int fibonacciMemo(int n, int[] memo) {
        if (n <= 0) return 0;
        if (n == 1) {
            return 1;
        } else if (memo[n] <= 0) {
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return memo[n];
    }
}
