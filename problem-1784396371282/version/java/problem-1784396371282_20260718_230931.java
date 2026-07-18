// Last updated: 18/07/2026, 23:09:31
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean increasing = true;
4        boolean decreasing = true;
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] > nums[i - 1]) {
7                decreasing = false;
8            }
9            if (nums[i] < nums[i - 1]) {
10                increasing = false;
11            }
12        }
13        return increasing || decreasing;
14    }
15}