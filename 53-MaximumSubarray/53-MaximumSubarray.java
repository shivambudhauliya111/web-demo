// Last updated: 8/22/2025, 4:45:35 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i<nums.length; i++){
            currentSum += nums[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum <0) {
                currentSum = 0;
            }
        }
        return maxSum;

    }
}
       