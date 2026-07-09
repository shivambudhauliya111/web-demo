// Last updated: 09/07/2026, 15:33:03
1class Solution {
2    public int balancedStringSplit(String s) {
3        int balance = 0;
4        int count = 0;
5        for (char ch : s.toCharArray()) {
6            if (ch == 'R') {
7                balance++;
8            } else {
9                balance--;
10            }
11            if (balance == 0) {
12                count++;
13            }
14        }
15        return count;
16    }
17}