class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0;
        int one = 0;
        for(int st : students){
            if(st == 0){
                zero++;
            }
            else{
                one++;
            }
        }
        for(int sand : sandwiches){
            if(sand == 0){
                if(zero == 0){
                    return one;
                }
                else{
                    zero--;
                }
            }
            else if(sand == 1){
                if(one == 0){
                    return zero;
                }
                else{
                    one--;
                }
            }
        }
        return zero;

    }
}