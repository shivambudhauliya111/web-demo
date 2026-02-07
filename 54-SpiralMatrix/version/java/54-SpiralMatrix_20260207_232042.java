// Last updated: 07/02/2026, 23:20:42
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5        List<Integer> ans = new ArrayList<>();
6
7        int top = 0, bottom = matrix.length - 1;
8        int left = 0, right = matrix[0].length - 1;
9
10        while (top <= bottom && left <= right) {
11            for (int j = left; j <= right; j++)
12                ans.add(matrix[top][j]);
13            top++;
14            for (int i = top; i <= bottom; i++)
15                ans.add(matrix[i][right]);
16            right--;
17            if (top <= bottom) {
18                for (int j = right; j >= left; j--)
19                    ans.add(matrix[bottom][j]);
20                bottom--;
21            }
22            if (left <= right) {
23                for (int i = bottom; i >= top; i--)
24                    ans.add(matrix[i][left]);
25                left++;
26            }
27        }
28        return ans;
29    }
30}
31