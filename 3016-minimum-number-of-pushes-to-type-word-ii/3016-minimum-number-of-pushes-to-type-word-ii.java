class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (frequencies.containsKey(ch)) {
                frequencies.put(ch, frequencies.get(ch) + 1);
            } else {
                frequencies.put(ch, 1);
            }
        }
        List<Integer> freq = new ArrayList<>();
        for (int value : frequencies.values()) {
            freq.add(value);
        }
        Collections.sort(freq, Collections.reverseOrder());
        int push = 0;
        for(int i = 0; i < freq.size(); i++){
            int cost = (i / 8) + 1;
            push += freq.get(i) * cost;
        }
        return push;
    }
}