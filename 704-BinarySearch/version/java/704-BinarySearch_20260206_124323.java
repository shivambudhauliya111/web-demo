// Last updated: 06/02/2026, 12:43:23
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            } else if (nums[mid] < target) {
12                low = mid + 1;
13            } else {
14                high = mid - 1;
15            }
16        }
17        return -1;
18    }
19}
20