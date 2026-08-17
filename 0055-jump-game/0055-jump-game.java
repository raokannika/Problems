class Solution {
    public boolean canJump(int[] nums) {
        int index;
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= reach) {
                index = i + nums[i];
                reach = Math.max(reach , index);
                if (reach >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}