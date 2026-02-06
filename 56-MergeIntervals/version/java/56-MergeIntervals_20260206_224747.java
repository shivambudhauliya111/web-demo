// Last updated: 06/02/2026, 22:47:47
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        if (intervals == null || intervals.length == 0)
6            return new int[0][0];
7        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
8
9        List<int[]> result = new ArrayList<>();
10
11        int start = intervals[0][0];
12        int end = intervals[0][1];
13
14        for (int i = 1; i < intervals.length; i++) {
15            if (intervals[i][0] <= end) {
16                end = Math.max(end, intervals[i][1]);
17            } 
18            else {
19                result.add(new int[]{start, end});
20                start = intervals[i][0];
21                end = intervals[i][1];
22            }
23        }
24        result.add(new int[]{start, end});
25
26        return result.toArray(new int[result.size()][]);
27    }
28}
29