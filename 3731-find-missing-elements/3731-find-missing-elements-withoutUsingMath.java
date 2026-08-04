class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        Set<Integer> elements = new HashSet<>();
        for( int num : nums){
            elements.add(num);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(!(elements.contains(i))){
                ans.add(i);
            }
        }
        return ans;
    }
}