package tests.java.hackerrank;

import main.java.hackerrank.fibonacci;
import main.java.helpers.Printer;

public class fibonacciTests {

    public void execute() {
        fibonacci fibonacciInstance = new fibonacci();
        long startTime;
        long stopTime;
        Printer print = new Printer("hackerrank fibonacci");

        // test 1
        // reg
        startTime = System.nanoTime();
        var result1a = fibonacciInstance.fibonacci(6);
        stopTime = System.nanoTime();
        print.newLine("fibonacci", "8",
                Integer.toString(result1a), startTime, stopTime);

        // memo
        startTime = System.nanoTime();
        var result1b = fibonacciInstance.fibonacciMemo(6, new int[10]);
        stopTime = System.nanoTime();
        print.newLine("fibonacciMemo", "8",
                Integer.toString(result1b), startTime, stopTime);

        // test 2

        // reg
        startTime = System.nanoTime();
        var result2a = fibonacciInstance.fibonacci(30);
        stopTime = System.nanoTime();
        print.newLine("fibonacci", "832040",
                Integer.toString(result2a), startTime, stopTime);

        // memo
        startTime = System.nanoTime();
        var result2b = fibonacciInstance.fibonacciMemo(30, new int[100]);
        stopTime = System.nanoTime();
        print.newLine("fibonacciMemo", "832040",
                Integer.toString(result2b), startTime, stopTime);
    }
}
