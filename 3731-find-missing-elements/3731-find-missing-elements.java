class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer, Integer> range = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            range.put(nums[i], 1);
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        ArrayList<Integer> miss = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(range.containsKey(i)){
                continue;
            }
            else{
                miss.add(i);
            }
        }
        return miss;
    }
}