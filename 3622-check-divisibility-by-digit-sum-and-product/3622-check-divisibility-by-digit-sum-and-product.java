class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int org = n;

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        int total = sum + product;
        return org % total == 0;
    }
}