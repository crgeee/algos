public class Printer {
    public void newLine(String category, String testName, String expected, String actual, String elapsed) {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + category + "] ");
        sb.append(testName + " // ");
        sb.append("expected: " + expected + " ");
        sb.append("actual: " + actual + " ");
        sb.append("elapsed: " + elapsed);
        System.out.println(sb.toString());
    }
}
