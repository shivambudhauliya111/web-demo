// Last updated: 09/02/2026, 23:50:01
1import java.util.*;
2
3class Solution {
4    public boolean isValid(String s) {
5
6        Stack<Character> stack = new Stack<>();
7
8        Map<Character, Character> map = new HashMap<>();
9        map.put(')', '(');
10        map.put('}', '{');
11        map.put(']', '[');
12
13        for (char ch : s.toCharArray()) {
14            if (ch == '(' || ch == '{' || ch == '[') {
15                stack.push(ch);
16            }
17            else {
18                if (stack.isEmpty()) return false;
19
20                char top = stack.pop();
21                if (top != map.get(ch)) return false;
22            }
23        }
24
25        return stack.isEmpty();
26    }
27}
28