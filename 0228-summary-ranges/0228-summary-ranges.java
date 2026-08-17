class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> range = new ArrayList<>();

        if (nums.length == 0) {
            return range;
        }

        int start = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] + 1 == nums[i + 1]) {
                continue;
            }

            if (start == i) {
                range.add(nums[start] + "");
            } else {
                range.add(nums[start] + "->" + nums[i]);
            }

            start = i + 1;  // IMPORTANT
        }

        if (start == nums.length - 1) {
            range.add(nums[start] + "");
        } else {
            range.add(nums[start] + "->" + nums[nums.length - 1]);
        }

        return range;
    }
}