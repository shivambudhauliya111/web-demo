// Last updated: 16/07/2026, 09:31:22
1class Solution {
2    public int arrangeCoins(int n) {
3        int row =0 ;
4        for(int i = 1;i<=n;i++){
5            if(n>=i){
6                n = n-i;
7                row++;
8            }else{
9                break;
10            }
11        }
12        return row;
13    }
14}