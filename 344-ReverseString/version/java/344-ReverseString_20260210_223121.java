// Last updated: 10/02/2026, 22:31:21
1class Solution {
2    public void reverseString(char[] s) {
3        int n=s.length;
4        for (int i=0;i<n/2;i++){
5            char ch = s[i];
6            s[i]=s[n-1-i];
7            s[n-1-i]=ch;
8        }
9        
10    }
11}