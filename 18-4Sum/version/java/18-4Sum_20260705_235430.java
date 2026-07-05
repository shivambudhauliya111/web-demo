// Last updated: 05/07/2026, 23:54:30
1import java.util.*;
2class Solution {
3    public List<List<Integer>> fourSum(int[] nums, int target) {
4        List<List<Integer>> ans = new ArrayList<>();
5        Arrays.sort(nums);
6        int n = nums.length;
7        for (int i = 0; i < n - 3; i++) {
8            if (i > 0 && nums[i] == nums[i - 1])
9                continue;
10            for (int j = i + 1; j < n - 2; j++) {
11                if (j > i + 1 && nums[j] == nums[j - 1])
12                    continue;
13                int left = j + 1;
14                int right = n - 1;
15                while (left < right) {
16                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
17                    if (sum == target) {
18                        ans.add(Arrays.asList(
19                                nums[i],
20                                nums[j],
21                                nums[left],
22                                nums[right]
23                        ));
24                        left++;
25                        right--;
26                        while (left < right && nums[left] == nums[left - 1])
27                            left++;
28                        while (left < right && nums[right] == nums[right + 1])
29                            right--;
30                    } else if (sum < target) {
31                        left++;
32                    } else {
33                        right--;
34                    }
35                }
36            }
37        }
38        return ans;
39    }
40}