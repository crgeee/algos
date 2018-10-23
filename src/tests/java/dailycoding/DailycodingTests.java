/*
 * Copyright 2018 SSC Pacific. All rights reserved.
 * The United States Government has unlimited rights to this software.
 * 
 * Distribution Statement D. Distribution authorized to the Department of Defense and
 * U.S. DoD Contractors only in support of US DoD efforts. Other requests shall be
 * referred to Marine Corps Systems Command (MCSC) Marine Air-Ground Task Force 
 * (MAGTF) Command and Control (C2) Systems (MC2S) Program.
 * 
 * Warning: - This document contains data whose export is restricted by the Arms 
 * Export Control Act (Title 22, U.S.C., Sec 2751, et seq.) as amended, or the Export 
 * Administration Act (Title 50, U.S.C., App 2401 et seq.) as amended. Violations of 
 * these export laws are subject to severe criminal and civil penalties. Disseminate 
 * in accordance with provisions of DoD Directive 5230.25. 
 * 
 */
package tests.java.dailycoding;

import main.java.dailycoding.problem_18;
import main.java.dailycoding.problem_20180829;
import main.java.helpers.Printer;

public class DailycodingTests {
    public void execute() {
        Printer print = new Printer("dailycoding");
        long startTime;
        long stopTime;
        long elapsed;

        // Given an array of integers, return a new array such that each element at index i of the new array is the
        // product of all the numbers in the original array except the one at i.
        //
        //For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our
        // input was [3, 2, 1], the expected output would be [2, 3, 6].
        problem_20180829 problem20180829 = new problem_20180829();
        int[] result100;

        // test 1
        int[] testInput = new int[] {3, 2, 1};
        startTime = System.nanoTime();
        result100 = problem20180829.tryOne(testInput);
        stopTime = System.nanoTime();
        print.newLine("brute force", "[2, 3, 6]",
                java.util.Arrays.toString(result100), startTime, stopTime);

        // test 2
        int[] testInput2 = new int[] {1,2,3,4,5};
        startTime = System.nanoTime();
        result100 = problem20180829.tryOne(testInput2);
        stopTime = System.nanoTime();
        print.newLine("brute force", "[120, 60, 40, 30, 24]",
                java.util.Arrays.toString(result100), startTime, stopTime);

        // test 3
        startTime = System.nanoTime();
        result100 = problem20180829.tryTwo(testInput);
        stopTime = System.nanoTime();
        print.newLine("brute force", "[2, 3, 6]",
                java.util.Arrays.toString(result100), startTime, stopTime);

        // test 4
        startTime = System.nanoTime();
        result100 = problem20180829.tryOne(testInput2);
        stopTime = System.nanoTime();
        print.newLine("brute force", "[120, 60, 40, 30, 24]",
                java.util.Arrays.toString(result100), startTime, stopTime);


        // problem 18
        problem_18 problem_18 = new problem_18();
        problem_18.tryOne(new int[] {10, 5, 2, 7, 8, 7}, 3);
    }
}
