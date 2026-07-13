// Last updated: 13/07/2026, 11:41:41
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int mask = 665772;
4        int ans = 0;
5        for (int i = left; i <= right; i++) {
6            ans += (mask >> Integer.bitCount(i)) & 1;
7        }
8        return ans;
9    }
10}