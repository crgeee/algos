package main.java.helpers;

public class Printer {
    private String category;

    public Printer(String category) {
        this.category = category;
    };

    public void newLine(String testName, String expected, String actual, long startTime, long stopTime) {
        long elapsed = stopTime - startTime;
        StringBuilder sb = new StringBuilder();

        sb.append("[" + this.category + "] ");
        sb.append(testName);
        sb.append(" || ");
        sb.append("passed: " + actual.equals(expected));
        sb.append(" || ");
        sb.append("elapsed: " + Long.toString(elapsed));
        sb.append(" || ");
        sb.append("expected: " + expected + " ");
        sb.append("actual: " + actual + " ");

        System.out.println(sb.toString());
    }
}
