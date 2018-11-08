package tests.java.cracking;

import main.java.cracking.ch10;
import main.java.helpers.Printer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ch10Tests {
    public void execute() {
        Printer print = new Printer("cracking ch10");
        long startTime;
        long stopTime;

        ch10 chapter10 = new ch10();

        //bubble sort tests
        String test1Title = "bubbleSort";

        int[] test = {1, 8, 7, 101, 3, 4, 4, 3, 1, 34, 9999, 65, 45, 54, 89};
        int[] expected = {1,1,3,3,4,4,7,8,34,45,54,65,89,101,9999};
        startTime = System.nanoTime();
        int[] result = chapter10.bubbleSort(test);
        stopTime = System.nanoTime();
        print.newLine(test1Title, Arrays.toString(expected), Arrays.toString(result), startTime, stopTime);

        int[] test2 = {1, 8, 5, 3};
        int[] expected2 = {1,3,5,8};
        startTime = System.nanoTime();
        int[] result2 = chapter10.bubbleSort(test2);
        stopTime = System.nanoTime();
        print.newLine(test1Title, Arrays.toString(expected2), Arrays.toString(result2), startTime, stopTime);

    }
}
