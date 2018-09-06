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

        //region QUICK FIND
        QuickFindUF quickFindUF = new QuickFindUF(100);
        startTime = System.nanoTime();
        quickFindUF.union(1,3);
        quickFindUF.union(3,5);
        quickFindUF.union(9,6);
        quickFindUF.union(8, 1);
        quickFindUF.union(0, 9);
        quickFindUF.union(0, 90);
        quickFindUF.union(23, 90);
        quickFindUF.union(24, 56);
        quickFindUF.union(30, 75);
        quickFindUF.union(30, 75);
        quickFindUF.union(9, 33);
        quickFindUF.union(33, 90);
        stopTime = System.nanoTime();
        print.newLine("Quick Find", "true", Boolean.toString(quickFindUF.connected(3,8)), startTime, stopTime);
        print.newLine("Quick Find", "true", Boolean.toString(quickFindUF.connected(5,8)), startTime, stopTime);
        print.newLine("Quick Find", "false", Boolean.toString(quickFindUF.connected(7, 9)), startTime, stopTime);
        print.newLine("Quick Find", "true", Boolean.toString(quickFindUF.connected(0, 6)), startTime, stopTime);
        System.out.println("ids: " + quickFindUF.getIdsAsString());
        //endregion QUICK FIND

        //region QUICK UNION
        QuickUnionUF quickUnion = new QuickUnionUF(100);
        startTime = System.nanoTime();
        quickUnion.union(1,3);
        quickUnion.union(3,5);
        quickUnion.union(9,6);
        quickUnion.union(8, 1);
        quickUnion.union(0, 9);
        quickUnion.union(0, 90);
        quickUnion.union(23, 90);
        quickUnion.union(24, 56);
        quickUnion.union(30, 75);
        quickUnion.union(30, 75);
        quickUnion.union(9, 33);
        quickUnion.union(33, 90);
        stopTime = System.nanoTime();
        print.newLine("Quick Union", "true", Boolean.toString(quickUnion.connected(3,8)), startTime, stopTime);
        print.newLine("Quick Union", "true", Boolean.toString(quickUnion.connected(5,8)), startTime, stopTime);
        print.newLine("Quick Union", "false", Boolean.toString(quickUnion.connected(7, 9)), startTime, stopTime);
        print.newLine("Quick Union", "true", Boolean.toString(quickUnion.connected(0, 6)), startTime, stopTime);
        System.out.println("ids: " + quickUnion.getIdsAsString());
        //endregion QUICK UNION
        

        //region QUICK UNION WEIGHTED
        QuickUnionWeightedUF quickUnionWeighted = new QuickUnionWeightedUF(100);
        startTime = System.nanoTime();
        quickUnionWeighted.union(1,3);
        quickUnionWeighted.union(3,5);
        quickUnionWeighted.union(9,6);
        quickUnionWeighted.union(8, 1);
        quickUnionWeighted.union(0, 9);
        quickUnionWeighted.union(0, 90);
        quickUnionWeighted.union(23, 90);
        quickUnionWeighted.union(24, 56);
        quickUnionWeighted.union(30, 75);
        quickUnionWeighted.union(30, 75);
        quickUnionWeighted.union(9, 33);
        quickUnionWeighted.union(33, 90);
        stopTime = System.nanoTime();
        print.newLine("Quick Union Weighted", "true", Boolean.toString(quickUnionWeighted.connected(3,8)), startTime, stopTime);
        print.newLine("Quick Union Weighted", "true", Boolean.toString(quickUnionWeighted.connected(5,8)), startTime, stopTime);
        print.newLine("Quick Union Weighted", "false", Boolean.toString(quickUnionWeighted.connected(7, 9)), startTime, stopTime);
        print.newLine("Quick Union Weighted", "true", Boolean.toString(quickUnionWeighted.connected(0, 6)), startTime, stopTime);
        System.out.println("ids: " + quickUnion.getIdsAsString());
        //endregion QUICK UNION WEIGHTED
    }

}
