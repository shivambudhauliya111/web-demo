// Last updated: 08/02/2026, 22:08:11
1class Solution {
2    public long wonderfulSubstrings(String word) {
3        long[] count = new long[1024]; // 2^10
4        count[0] = 1;
5        int mask = 0;
6        long result = 0;
7for (char ch : word.toCharArray()) {
8            int bit = ch - 'a';
9            mask ^= (1 << bit);
10            result += count[mask];
11            for (int i = 0; i < 10; i++) {
12                result += count[mask ^ (1 << i)];
13            }
14            count[mask]++;
15        }
16        return result;
17    }
18}
19