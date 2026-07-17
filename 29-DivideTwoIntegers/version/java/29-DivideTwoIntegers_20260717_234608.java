// Last updated: 17/07/2026, 23:46:08
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if(dividend == -2147483648&&divisor == -1){
4            return  2147483647;
5        }
6      int x=dividend/divisor;
7      return x;    
8    }
9}