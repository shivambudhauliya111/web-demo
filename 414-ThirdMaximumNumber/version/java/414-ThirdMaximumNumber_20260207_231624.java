// Last updated: 07/02/2026, 23:16:24
1import java.util.*;
2
3class Solution {
4    public int thirdMax(int[] nums) {
5        Set<Integer> set = new HashSet<>();
6        for (int num : nums) {
7            set.add(num);
8        }
9
10        List<Integer> list = new ArrayList<>(set);
11        Collections.sort(list, Collections.reverseOrder());
12
13        return list.size() < 3 ? list.get(0) : list.get(2);
14    }
15}
16