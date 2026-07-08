// Last updated: 08/07/2026, 16:10:35
1import java.util.HashSet;
2class Solution {
3    public boolean isValidSudoku(char[][] board) {
4        HashSet<Character>[] rows = new HashSet[9];
5        HashSet<Character>[] cols = new HashSet[9];
6        HashSet<Character>[] boxes = new HashSet[9];
7        for (int i = 0; i < 9; i++) {
8            rows[i] = new HashSet<>();
9            cols[i] = new HashSet<>();
10            boxes[i] = new HashSet<>();
11        }
12        for (int i = 0; i < 9; i++) {
13            for (int j = 0; j < 9; j++) {
14                char ch = board[i][j];
15                if (ch == '.') {
16                    continue;
17                }
18                int box = (i / 3) * 3 + (j / 3);
19                if (rows[i].contains(ch) || cols[j].contains(ch) || boxes[box].contains(ch)) {
20                    return false;
21                }
22                rows[i].add(ch);
23                cols[j].add(ch);
24                boxes[box].add(ch);
25            }
26        }
27        return true;
28    }
29}