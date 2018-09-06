package main.java;

import tests.java.dailycoding.DailycodingTests;
import tests.java.leetcode.LeetcodeTests;
import tests.java.sedgewick.SedgewickTests;

public class Main {

    public static void main(String[] args) {
        SedgewickTests sedgewick = new SedgewickTests();
        sedgewick.execute();

        LeetcodeTests leetcodeTests = new LeetcodeTests();
        leetcodeTests.execute();
        
        DailycodingTests dailycodingTests = new DailycodingTests();
        dailycodingTests.execute();
    }
}