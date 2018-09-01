package tests.java.leetcode;

import main.java.helpers.Printer;
import main.java.leetcode.*;

public class LeetcodeTests {
    public void execute() {
        Printer print = new Printer("leetcode");
        long startTime;
        long stopTime;

        // brute force
        TwoSums twoSums = new TwoSums();
        // test 1
        startTime = System.nanoTime();
        int[] result1 = twoSums.bruteForce(new int[] {2, 7, 11, 15}, 9);
        stopTime = System.nanoTime();
        print.newLine( "two sum brute force", "[0, 1]",
                java.util.Arrays.toString(result1), startTime, stopTime);

        // two pass
        int [] result2 = twoSums.twoPassHash(new int[] {2, 7, 11, 15}, 9);
        System.out.println("result2: " + java.util.Arrays.toString(result2));

        // one pass
        int[] result3 = twoSums.onePassHash(new int[] {2, 7, 11, 15}, 9);
        System.out.println("result3: " + java.util.Arrays.toString(result3));

        // palindrome number
        PalindromeNumber palNum = new PalindromeNumber();


        // test 1
        startTime = System.nanoTime();
        boolean result4 = palNum.isPalindrome(121);
        stopTime = System.nanoTime();
        System.out.println("result4: " + result4);
        System.out.println(stopTime - startTime);

        // test 2
        startTime = System.nanoTime();
        boolean result5 = palNum.isPalindrome(10);
        stopTime = System.nanoTime();
        System.out.println("result5: " + result5);
        System.out.println(stopTime - startTime);

        // test 3
        startTime = System.nanoTime();
        boolean result6 = palNum.isPalindrome(-121);
        stopTime = System.nanoTime();
        System.out.println("result6: " + result6);
        System.out.println(stopTime - startTime);

        // test 4
        startTime = System.nanoTime();
        boolean result7 = palNum.isPalindrome(3004003);
        stopTime = System.nanoTime();
        System.out.println("result7: " + result7);
        System.out.println(stopTime - startTime);

        // palindrome 2 tests

        // test 5
        startTime = System.nanoTime();
        boolean result8 = palNum.isPalindrome2(121);
        stopTime = System.nanoTime();
        System.out.println("result8: " + result8);
        System.out.println(stopTime - startTime);

        // test 6
        startTime = System.nanoTime();
        boolean result9 = palNum.isPalindrome2(10);
        stopTime = System.nanoTime();
        System.out.println("result9: " + result9);
        System.out.println(stopTime - startTime);

        // test 7
        startTime = System.nanoTime();
        boolean result10 = palNum.isPalindrome2(-121);
        stopTime = System.nanoTime();
        System.out.println("result10: " + result10);
        System.out.println(stopTime - startTime);

        // test 8
        startTime = System.nanoTime();
        boolean result11 = palNum.isPalindrome2(3004003);
        stopTime = System.nanoTime();
        System.out.println("result11: " + result11);
        System.out.println(stopTime - startTime);

    }
}
