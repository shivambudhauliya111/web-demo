// Last updated: 06/07/2026, 12:08:58
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int closestSum = nums[0] + nums[1] + nums[2];
4        for(int i=0; i<nums.length - 2; i++){
5            for(int j = i+1; j<nums.length -1;j++ ){
6                for(int k=j+1; k<nums.length;k++){
7                    int sum = nums[i]+nums[j]+nums[k];
8                    if(Math.abs(sum - target)<Math.abs(closestSum - target)){
9                        closestSum = sum;
10                    }
11                }
12            }
13        }
14        return closestSum;
15    }
16}