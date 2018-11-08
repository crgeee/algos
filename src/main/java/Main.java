package main.java;

import tests.java.cracking.ch10Tests;
import tests.java.cracking.ch1Tests;
import tests.java.dailycoding.DailycodingTests;
import tests.java.grokking.ch4Tests;
import tests.java.hackerrank.fibonacciTests;
import tests.java.leetcode.LeetcodeTests;
import tests.java.sedgewick.SedgewickTests;

public class Main {

    public static void main(String[] args) {
        SedgewickTests sedgewick = new SedgewickTests();
        sedgewick.execute();

        System.out.println();

        LeetcodeTests leetcodeTests = new LeetcodeTests();
        leetcodeTests.execute();

        System.out.println();

        DailycodingTests dailycodingTests = new DailycodingTests();
        dailycodingTests.execute();

        System.out.println();

        ch4Tests grokkingCh4Tests = new ch4Tests();
        grokkingCh4Tests.execute();

        System.out.println();

        ch1Tests crackingCh1Tests = new ch1Tests();
        crackingCh1Tests.execute();

        System.out.println();

        ch10Tests crackingCh10Tests = new ch10Tests();
        crackingCh10Tests.execute();

        System.out.println();

        fibonacciTests fibonacciTests = new fibonacciTests();
        fibonacciTests.execute();
    }
}
