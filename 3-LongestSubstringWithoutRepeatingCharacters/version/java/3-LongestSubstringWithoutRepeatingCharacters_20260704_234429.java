// Last updated: 04/07/2026, 23:44:29
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if (s.length() <= 1) {
4            return s.length();
5        }
6        int max = 0;
7        for (int i = 0; i < s.length(); i++) {
8            boolean[] seen = new boolean[256]; 
9            int length = 0;
10            for (int j = i; j < s.length(); j++) { 
11                char currentChar = s.charAt(j);
12                if (!seen[currentChar]) {
13                    seen[currentChar] = true;
14                    length++;
15                    max = Math.max(max, length); 
16                } else {
17                    break;
18                }
19            }
20        }
21        return max;
22    }
23}