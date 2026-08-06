class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int secondLargest = 0;
        int num = n;
        while(num > 0){
            int digit = num % 10;
            if(digit >= largest){
                secondLargest = largest;
                largest = digit;
            }
            else if(digit > secondLargest){
                secondLargest = digit;
            }
            num /= 10;
        }
        return largest * secondLargest;
    }
}