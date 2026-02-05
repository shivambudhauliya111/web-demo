// Last updated: 05/02/2026, 22:17:30
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int score=0;
4        int depth=0;
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(c=='('){
8                depth++;
9            }
10            else{
11                depth--;
12            
13            if(s.charAt(i-1)=='('){
14            score+=1<<depth;
15            }
16        }
17        
18    }
19    return score;
20}
21}