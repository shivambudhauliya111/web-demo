// Last updated: 07/07/2026, 12:34:33
1class Solution {
2    public int missingNumber(int[] nums) {
3          for(int i=0;i<=nums.length;i++){
4            int c=0;
5            for(int j=0;j<nums.length;j++){
6                if(nums[j]==i){
7                    c=1;
8                }
9            }
10            if(c==0){
11                return i;
12            }
13}   return -1;  
14 }
15}