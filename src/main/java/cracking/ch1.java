package main.java.cracking;

import java.util.HashMap;

public class ch1 {

    // 1.1
    public boolean isUniqueCharacters(String myString) {
        char[] arr = myString.toCharArray();
        for (int x = 0; x < arr.length; x++)
        {
            for (int y = 0; y < arr.length; y++) {
                if (x == y) continue;
                if (arr[x] == arr[y]) return false;
            }
        }
        return true;
    }

    public boolean isUnqiueCharsHashMap(String myString) {
        HashMap<Character, Character> newMap = new HashMap<>();
        char[] myCharArr = myString.toCharArray();
        for (char myChar : myCharArr) {
            if (newMap.containsKey(myChar)) return false;
            else newMap.put(myChar,myChar);
        }
        return true;
    }

    public boolean isUniqueCharsBook(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public boolean isUniqueCharsBookVector(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
