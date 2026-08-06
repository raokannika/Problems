class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1;
        int sum = 0;
        int num = n;
        while (num > 0) {
            int rem = num % 10;
            pro *= rem;
            sum += rem;
            num /= 10;
        }
        int diff = pro - sum;
        return diff;
    }
}