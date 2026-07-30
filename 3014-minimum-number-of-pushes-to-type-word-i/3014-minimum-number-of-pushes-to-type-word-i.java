class Solution {
    public int minimumPushes(String word) {
        int length = word.length();
        int group  = length / 8;
        int individual = length % 8;
        int total_cost = 8 * ((group * (group + 1) / 2)) + (individual * (group + 1));
        return total_cost;
    }
}