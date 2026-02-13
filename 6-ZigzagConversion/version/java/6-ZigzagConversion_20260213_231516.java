// Last updated: 13/02/2026, 23:15:16
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1) return s;
4
5        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
6        for (int i = 0; i < rows.length; i++) {
7            rows[i] = new StringBuilder();
8        }
9
10        int currentRow = 0;
11        boolean goingDown = false;
12
13        for (char c : s.toCharArray()) {
14            rows[currentRow].append(c);
15            if (currentRow == 0 || currentRow == numRows - 1) {
16                goingDown = !goingDown;
17            }
18            currentRow += goingDown ? 1 : -1;
19        }
20
21        StringBuilder result = new StringBuilder();
22        for (StringBuilder row : rows) {
23            result.append(row);
24        }
25        return result.toString();
26    }
27}