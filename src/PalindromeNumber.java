import java.util.HashMap;
import java.util.Map;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int compare = x;
        int ret = 0;
        while (x != 0) {
            if (Math.abs(ret) > 214748364) {
                return false;
            }
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        if (ret == compare) return true;
        return false;
    }

    // 1221 should return true

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;

        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
