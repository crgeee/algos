package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
//
//    private int[] _nums;
//    private int _target;
//
//    public TwoSums(int[] nums, int target) {
//        this._nums = nums;
//        this._target = target;
//    }

    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public int[] twoPassHash(int [] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // map nums value and index to hashmap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // compute "complement" then check if it is in hashmap and doesn't equal the same value
        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            if (map.containsKey(complement) && map.get(complement) != j) {
                // return indices here
                return new int[] {j, map.get(complement)};
            }
        }
        throw new IllegalArgumentException();
    }

    public int[] onePassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // map nums value and index to hashmap
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
            {
                // return indices here
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
