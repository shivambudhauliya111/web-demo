// Last updated: 21/07/2026, 23:39:11
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        return build(s).equals(build(t));
4    }
5    private String build(String str) {
6        StringBuilder sb = new StringBuilder();
7        for (char c : str.toCharArray()) {
8            if (c != '#') {
9                sb.append(c);
10            } else if (sb.length() > 0) {
11                sb.deleteCharAt(sb.length() - 1);
12            }
13        }
14        return sb.toString();
15    }
16}