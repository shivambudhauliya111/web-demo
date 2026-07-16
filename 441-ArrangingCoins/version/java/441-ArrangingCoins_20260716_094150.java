// Last updated: 16/07/2026, 09:41:50
1class Solution {
2    public int arrangeCoins(int n) {
3        int row =0 ;
4        for(int i = 1;i<=n;i++){
5            if(n>=i){
6           // while(n>row){
7              //  row++;
8                n = n-i;
9                row++;
10            }else{
11                break;
12            }
13       }
14        return row;
15    }
16}