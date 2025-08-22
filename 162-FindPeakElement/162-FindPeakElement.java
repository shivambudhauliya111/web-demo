// Last updated: 8/22/2025, 4:45:19 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            final int n = (l+r)/2;
            if(nums[n]>= nums[n+1])
            r=n;
            else
            l=n+1;
        }
return l;
        
    }
}