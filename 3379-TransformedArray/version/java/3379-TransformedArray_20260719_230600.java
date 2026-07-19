// Last updated: 19/07/2026, 23:06:00
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5        for (int i = 0; i < n; i++) {
6            if (nums[i] == 0) {
7                result[i] = 0;
8            } else {
9                int newIndex = (i + nums[i]) % n;
10                if (newIndex < 0) {
11                    newIndex += n;
12                }
13                result[i] = nums[newIndex];
14            }
15        }
16        return result;
17    }
18}