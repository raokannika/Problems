class Solution {
    public static boolean winnerCheck(int left, int right, int score1, int score2, int[] nums, boolean player1) {
        if (left > right) {
             return score1 >= score2;
        }
        if(player1){
            boolean leftChoice = winnerCheck(left + 1, right, score1 + nums[left], score2, nums, false);
            boolean rightChoice = winnerCheck(left, right - 1, score1 + nums[right], score2, nums, false);
            return leftChoice || rightChoice;
        }
        else{
            boolean leftChoice = winnerCheck(left + 1, right, score1, score2 + nums[left], nums, true);
            boolean rightChoice = winnerCheck(left, right - 1, score1, score2 + nums[right], nums, true);
            return leftChoice && rightChoice;
        }
    }

    public boolean predictTheWinner(int[] nums) {
        boolean player1 = true;
        int left = 0;
        int right = nums.length - 1;
        int score1 = 0;
        int score2 = 0;
        boolean result = winnerCheck(left, right, score1, score2, nums, player1);
        return result;
    }
}