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