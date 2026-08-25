class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> present =  new HashSet<>();
        for(int num : nums){
            present.add(num);
        }
        int j = 1;
        while(present.contains(j * k)){
            j++;
        }
        return j * k;
    }
}