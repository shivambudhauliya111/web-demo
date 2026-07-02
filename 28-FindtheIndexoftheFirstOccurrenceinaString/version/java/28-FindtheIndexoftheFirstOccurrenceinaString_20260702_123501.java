// Last updated: 02/07/2026, 12:35:01
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int m = haystack.length();
4        int n = needle.length();
5
6        if (n == 0) {
7            return 0;
8        }
9
10        for (int i = 0; i <= m - n; i++) {
11            int j = 0;
12
13            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
14                j++;
15            }
16
17            if (j == n) {
18                return i;
19            }
20        }
21
22        return -1;
23    }
24}