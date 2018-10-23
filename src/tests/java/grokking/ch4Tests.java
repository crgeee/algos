package tests.java.grokking;

import main.java.grokking.ch4;
import main.java.helpers.Printer;

public class ch4Tests {
    public void execute() {
        ch4 ch4instance = new ch4();
        long startTime;
        long stopTime;
        Printer print = new Printer("grokking");

        // test 1 sum
        int[] arr = new int[]{1,2,3,4,10};
        startTime = System.nanoTime();
        System.out.println(ch4instance.sum(arr));
        stopTime = System.nanoTime();

        // test 2 sum
        int[] arr2 = new int[]{40,25,25,10};
        startTime = System.nanoTime();
        System.out.println(ch4instance.sum(arr2));
        stopTime = System.nanoTime();

        // test 3 max
        int[] arr3 = new int[]{10,2,4,5,100,433,2,34,53,3040};
        startTime = System.nanoTime();
        int result3 = ch4instance.max(arr3);
        stopTime = System.nanoTime();
        print.newLine("test 3 max", "3040", String.valueOf(result3), startTime, stopTime);

        // test 3 maxdos
        startTime = System.nanoTime();
        int result4 = ch4instance.maxdos(arr3);
        stopTime = System.nanoTime();
        print.newLine("test 3 maxdos", "3040", String.valueOf(result4), startTime, stopTime);
    }

}
