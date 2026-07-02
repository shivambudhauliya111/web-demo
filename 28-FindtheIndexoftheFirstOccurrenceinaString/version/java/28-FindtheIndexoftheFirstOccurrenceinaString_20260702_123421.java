// Last updated: 02/07/2026, 12:34:21
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int m = haystack.length();
4        int n = needle.length();
5        if (n == 0) {
6            return 0;
7        }
8        for (int i = 0; i <= m - n; i++) {
9            int j;
10            for (j = 0; j < n; j++) {
11                if (haystack.charAt(i + j) != needle.charAt(j)) {
12                    break;
13                }
14            }
15            if (j == n) {
16                return i;
17            }
18        }
19        return -1;
20    }
21}