class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int winner = 0;
        for(int i = 0; i < n; i++){
            int[] colors = new int[11];
            for(int[] j : pick){
                if(j[0] == i){
                    int c = j[1];
                    colors[c]++;
                    if(colors[c] > i){
                        winner++;
                        break;
                    }
                }
            }
        }
        return winner;
    }
}