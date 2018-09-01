package tests.java.sedgewick;

import main.java.helpers.Printer;
import main.java.sedgewick.QuickFindUF;
import main.java.sedgewick.QuickUnionUF;
import main.java.sedgewick.QuickUnionWeightedUF;

public class SedgewickTests {
    public void execute() {
        Printer print = new Printer("sedgewick");
        long startTime;
        long stopTime;
        long elapsed;

        //region QUICK FIND
        System.out.println("BEGIN Quick Find");
        QuickFindUF quickFindUF = new QuickFindUF(10);
        startTime = System.nanoTime();
        quickFindUF.union(1,3);
        quickFindUF.union(3,5);
        quickFindUF.union(9,6);
        quickFindUF.union(8, 1);
        quickFindUF.union(0, 9);
        stopTime = System.nanoTime();
        print.newLine("Quick Find", "true", Boolean.toString(quickFindUF.connected(3,8)), startTime, stopTime);
        print.newLine("Quick Find", "true", Boolean.toString(quickFindUF.connected(5,8)), startTime, stopTime);
        print.newLine("Quick Find", "true", Boolean.toString(quickFindUF.connected(7, 9)), startTime, stopTime);
        print.newLine("Quick Find", "true", Boolean.toString(quickFindUF.connected(0, 6)), startTime, stopTime);
        System.out.println("ids: " + quickFindUF.getIdsAsString());
        System.out.println("END Quick Find");
        //endregion QUICK FIND

        //region QUICK UNION
        System.out.println("BEGIN Quick Union");
        QuickUnionUF quickUnion = new QuickUnionUF(10);
        startTime = System.nanoTime();
        quickUnion.union(1,3);
        quickUnion.union(3,5);
        quickUnion.union(9,6);
        quickUnion.union(8, 1);
        quickUnion.union(0, 9);
        stopTime = System.nanoTime();
        System.out.println("result should be true: " + quickUnion.connected(3,8));
        System.out.println("result should be true: " + quickUnion.connected(5,8));
        System.out.println("result should be false: " + quickUnion.connected(7, 9));
        System.out.println("result should be true: " + quickUnion.connected(0, 6));
        System.out.println(quickUnion.getIdsAsString());
        System.out.println("END Quick Union");
        //endregion QUICK UNION

        //region QUICK UNION WEIGHTED
        System.out.println("BEGIN Quick Union Weighted");
        QuickUnionWeightedUF quickUnionWeighted = new QuickUnionWeightedUF(10);
        startTime = System.nanoTime();
        quickUnionWeighted.union(1,3);
        quickUnionWeighted.union(3,5);
        quickUnionWeighted.union(9,6);
        quickUnionWeighted.union(8, 1);
        quickUnionWeighted.union(0, 9);
        stopTime = System.nanoTime();
        elapsed = stopTime - startTime;
        System.out.println("elapsed: " + elapsed);
        System.out.println("result should be true: " + quickUnionWeighted.connected(3,8));
        System.out.println("result should be true: " + quickUnionWeighted.connected(5,8));
        System.out.println("result should be false: " + quickUnionWeighted.connected(7, 9));
        System.out.println("result should be true: " + quickUnionWeighted.connected(0, 6));
        System.out.println(quickUnion.getIdsAsString());
        System.out.println("END Quick Union Weighted");
        //endregion QUICK UNION WEIGHTED
    }

}
