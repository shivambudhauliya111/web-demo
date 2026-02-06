// Last updated: 06/02/2026, 13:18:57
1
2class Solution{
3    public int search(int nums[],int target){
4        int low=0;
5        int high=nums.length-1;
6        while(low<=high){
7            int mid = low + (high - low) / 2;
8            if(nums[mid]==target){
9                return mid;
10            }else if(nums[mid]<target){
11               low= mid+1;
12            }else{
13                high=mid-1;
14            }
15        }
16        return -1;
17    }
18}