package tests.java.cracking;

import main.java.cracking.ch1;
import main.java.helpers.Printer;

public class ch1Tests {
    public void execute() {
        Printer print = new Printer("cracking ch1");
        long startTime;
        long stopTime;

        ch1 chapter1 = new ch1();

        // test 1
        String testStringUnique = "howdy";
        String testStringNotUnqiue = "howdytherecarebear";

        startTime = System.nanoTime();
        boolean result1a = chapter1.isUniqueCharacters(testStringUnique);
        stopTime = System.nanoTime();
        print.newLine( "isUniqueCharacters", "true",
                Boolean.toString(result1a), startTime, stopTime);

        startTime = System.nanoTime();
        boolean result1b = chapter1.isUnqiueCharsHashMap(testStringUnique);
        stopTime = System.nanoTime();
        print.newLine( "isUnqiueCharsHashMap", "true",
                Boolean.toString(result1b), startTime, stopTime);

        startTime = System.nanoTime();
        boolean result1c = chapter1.isUniqueCharsBook(testStringUnique);
        stopTime = System.nanoTime();
        print.newLine( "isUniqueCharsBook", "true",
                Boolean.toString(result1c), startTime, stopTime);

        startTime = System.nanoTime();
        boolean result1d = chapter1.isUniqueCharsBookVector(testStringUnique);
        stopTime = System.nanoTime();
        print.newLine( "isUniqueCharsBookVector", "true",
                Boolean.toString(result1d), startTime, stopTime);

        // test 2
        startTime = System.nanoTime();
        boolean result2a = chapter1.isUniqueCharacters(testStringNotUnqiue);
        stopTime = System.nanoTime();
        print.newLine( "isUniqueCharacters", "false",
                Boolean.toString(result2a), startTime, stopTime);

        startTime = System.nanoTime();
        boolean result2b = chapter1.isUnqiueCharsHashMap(testStringNotUnqiue);
        stopTime = System.nanoTime();
        print.newLine( "isUnqiueCharsHashMap", "false",
                Boolean.toString(result2b), startTime, stopTime);

        startTime = System.nanoTime();
        boolean result2c = chapter1.isUniqueCharsBook(testStringNotUnqiue);
        stopTime = System.nanoTime();
        print.newLine( "isUniqueCharsBook", "false",
                Boolean.toString(result2c), startTime, stopTime);

        startTime = System.nanoTime();
        boolean result2d = chapter1.isUniqueCharsBookVector(testStringNotUnqiue);
        stopTime = System.nanoTime();
        print.newLine( "isUniqueCharsBookVector", "false",
                Boolean.toString(result2d), startTime, stopTime);

    }
}
