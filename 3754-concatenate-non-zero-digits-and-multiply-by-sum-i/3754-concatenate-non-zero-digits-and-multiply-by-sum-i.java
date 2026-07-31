class Solution {
    public long sumAndMultiply(int n) {
        long concat = 0;
        long place = 1;
        long digit = 0;
        long sum = 0;
        while( n != 0){
            digit = n % 10;
            if(digit != 0){
                sum += digit;
                concat += digit * place;
                place *= 10;
            }
            n /= 10;
        }
        return concat * sum;
    }
}