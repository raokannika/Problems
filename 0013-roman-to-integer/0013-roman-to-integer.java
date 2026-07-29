class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> val = new HashMap<>();
        val.put('I',1);
        val.put('V',5);
        val.put('X',10);
        val.put('L',50);
        val.put('C',100);
        val.put('D',500);
        val.put('M',1000);
        int ans = 0;
        for(int i = 0 ; i < s.length(); i++){
            int first = val.get(s.charAt(i));
            if(i < s.length() - 1){
                int sec = val.get(s.charAt(i+1));
                if(first < sec){
                    ans -= first;
                }
                else{
                    ans += first;
                }
            }
            else{
                ans += first;
            }
        }
        return ans;
    }
}