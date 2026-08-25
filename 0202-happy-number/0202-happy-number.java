class Solution {
    public boolean isHappy(int n) {
        Set<Integer> happy = new HashSet<>();
        while(n != 1){
            if(happy.contains(n)){
                return false;
            }
            happy.add(n);
            int sum = 0;
            while(n != 0){
                int rem = n % 10;
                int sq = rem * rem;
                sum += sq;
                n /= 10;
            }
            n = sum;
        }
        return true;
    }
}