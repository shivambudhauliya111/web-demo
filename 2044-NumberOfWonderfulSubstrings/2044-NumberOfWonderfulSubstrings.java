// Last updated: 24/06/2026, 14:28:46
class Solution {
    public long wonderfulSubstrings(String word) {
        long[] count = new long[1024]; // 2^10
        count[0] = 1;
        int mask = 0;
        long result = 0;
for (char ch : word.toCharArray()) {
            int bit = ch - 'a';
            mask ^= (1 << bit);
            result += count[mask];
            for (int i = 0; i < 10; i++) {
                result += count[mask ^ (1 << i)];
            }
            count[mask]++;
        }
        return result;
    }
}
