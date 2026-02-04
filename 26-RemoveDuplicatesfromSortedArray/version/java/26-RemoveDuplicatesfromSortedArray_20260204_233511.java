// Last updated: 04/02/2026, 23:35:11
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length == 0)return 0;
4        int i =0;
5        for(int j = 1; j<nums.length;j++){
6            if(nums[j]!=nums[i]){
7                i++;
8                nums[i]=nums[j];
9            }
10        }
11       return i+1; 
12    }
13}