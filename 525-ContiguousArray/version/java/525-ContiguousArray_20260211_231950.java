// Last updated: 11/02/2026, 23:19:50
1import java.util.HashMap;
2
3class Solution {
4    public int findMaxLength(int[] nums) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        map.put(0, -1);
7        
8        int sum = 0;
9        int maxLen = 0;
10
11        for (int i = 0; i < nums.length; i++) {
12            if (nums[i] == 1)
13                sum += 1;
14            else
15                sum -= 1;
16            if (map.containsKey(sum)) {
17                maxLen = Math.max(maxLen, i - map.get(sum));
18            } else {
19                map.put(sum, i);
20            }
21        }
22
23        return maxLen;
24    }
25}
26