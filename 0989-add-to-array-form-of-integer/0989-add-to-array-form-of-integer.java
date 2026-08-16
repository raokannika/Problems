class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int current = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = num.length - 1 ; i >= 0; i--){
            current = num[i] + k;
            int rem = current % 10;
            int carry = current / 10;
            k = carry;
            ans.add(rem);
        }
        while(k > 0){
            int rem = k % 10;
            ans.add(rem);
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}