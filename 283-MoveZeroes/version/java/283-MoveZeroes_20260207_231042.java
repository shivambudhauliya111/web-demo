// Last updated: 07/02/2026, 23:10:42
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != 0) {
6                nums[index++] = nums[i];
7            }
8        }
9        while (index < nums.length) {
10            nums[index++] = 0;
11        }
12    }
13}
14