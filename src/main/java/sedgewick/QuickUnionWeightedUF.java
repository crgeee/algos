package main.java.sedgewick;

public class QuickUnionWeightedUF {
    private int[] id;
    private int[] sz;

    // set id of each object to itself (N array accesses)
    public QuickUnionWeightedUF(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    // chase parent points until reach root (depth of i array accesses)
    private int root(int i) {
        // if not equal, set i up one level and check again
        while (i != id[i]) {
            id[i] = id[id[i]]; // path compression: while getting depth, flatten tree
            i = id[i];
        }
        return i;
    }

    // check if p and q have same root (depth of p and q array accesses)
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // change root of p to point to root of q (depth of p and q array accesses)
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) return; // not sure what's going on here
        // set the root of smaller tree to the larger tree in both instances
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i]; // increment larger tree count with smaller tree count
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public String getIdsAsString() {
        return java.util.Arrays.toString(this.id);
    }
}
