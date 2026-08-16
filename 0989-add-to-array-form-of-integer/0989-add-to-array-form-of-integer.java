class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = num.length - 1 ; i >= 0; i--){
            int current = num[i] + k;
            int rem = current % 10;
            k = current / 10;
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