// Last updated: 15/02/2026, 23:30:01
1class Solution {
2    public int reverse(int x) {
3        int m = 0;
4
5        while (x != 0) {
6            int rem = x % 10;
7
8           
9            if (m > Integer.MAX_VALUE / 10 || (m == Integer.MAX_VALUE / 10 && rem > 7)) {
10                return 0; 
11            }
12
13            
14            if (m < Integer.MIN_VALUE / 10 || (m == Integer.MIN_VALUE / 10 && rem < -8)) {
15                return 0;
16            }
17            m = m * 10 + rem;
18            x /= 10;
19        }
20
21        return m;
22    }
23}