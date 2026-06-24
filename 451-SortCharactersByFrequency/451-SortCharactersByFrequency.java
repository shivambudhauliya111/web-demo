// Last updated: 24/06/2026, 14:29:03
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128]; // ASCII
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                buckets[freq[i]].add((char) i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i > 0; i--) {
            for (char c : buckets[i]) {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
