class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        double rem, rev = 0;

        if (x < 0) {
            return false;
        }

        while (x != 0) {
            rem = x % 10;
            x /= 10;
            rev = (rev * 10) + rem;
        }

        return rev == org;
    }
}