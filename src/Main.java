public class Main {

    public static void main(String[] args) {
        Printer print = new Printer();
        long startTime;
        long stopTime;

        // QUICK FIND
        System.out.println("BEGIN Quick Find");
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.union(1,3);
        quickFindUF.union(3,5);
        quickFindUF.union(9,6);
        quickFindUF.union(8, 1);
        quickFindUF.union(0, 9);
        System.out.println("result should be true: " + quickFindUF.connected(3,8));
        System.out.println("result should be true: " + quickFindUF.connected(5,8));
        System.out.println("result should be false: " + quickFindUF.connected(7, 9));
        System.out.println("result should be true: " + quickFindUF.connected(0, 6));
        System.out.println(quickFindUF.getIdsAsString());
        System.out.println("END Quick Find");

        // brute force
        TwoSums twoSums = new TwoSums();
        // test 1
        startTime = System.nanoTime();
        int[] result1 = twoSums.bruteForce(new int[] {2, 7, 11, 15}, 9);
        stopTime = System.nanoTime();
        print.newLine("two sums", "brute force", "[0,1]",
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

        // Given an array of integers, return a new array such that each element at index i of the new array is the
        // product of all the numbers in the original array except the one at i.
        //
        //For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our
        // input was [3, 2, 1], the expected output would be [2, 3, 6].
        DailyCoding082918 dailyCoding082918 = new DailyCoding082918();
        int[] result100;

        // test 1
        int[] testInput = new int[] {3, 2, 1};
        startTime = System.nanoTime();
        result100 = dailyCoding082918.tryOne(testInput);
        stopTime = System.nanoTime();
        print.newLine("DailyCoding082918", "brute force", "[2, 3, 6]",
                java.util.Arrays.toString(result100), startTime, stopTime);

        // test 2
        int[] testInput2 = new int[] {1,2,3,4,5};
        startTime = System.nanoTime();
        result100 = dailyCoding082918.tryOne(testInput2);
        stopTime = System.nanoTime();
        print.newLine("DailyCoding082918", "brute force", "[120, 60, 40, 30, 24]",
                java.util.Arrays.toString(result100), startTime, stopTime);

        // test 3
        startTime = System.nanoTime();
        result100 = dailyCoding082918.tryTwo(testInput);
        stopTime = System.nanoTime();
        print.newLine("DailyCoding082918", "brute force", "[2, 3, 6]",
                java.util.Arrays.toString(result100), startTime, stopTime);

        // test 4
        startTime = System.nanoTime();
        result100 = dailyCoding082918.tryOne(testInput2);
        stopTime = System.nanoTime();
        print.newLine("DailyCoding082918", "brute force", "[120, 60, 40, 30, 24]",
                java.util.Arrays.toString(result100), startTime, stopTime);
    }
}