public class Solution {
    public boolean isPowerOfTwo(int n) {
        // ex) 2^0 = 1, 1 & 0 = 0
        // ex) 2^1 = 2, 10 & 01 = 0
        // ex) 2^3 = 8, 1000, 0111 = 0
        // ex) 9, 1001, 1000 = 1110
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public boolean isPowerOfTwo2(int n) {
        if (n < 1) {
            return false;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }

            n = n / 2;
        }
        return true;
    }
}