// Last updated: 1/12/2026, 10:21:00 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        return MaxSum(nums);
4        
5    }
6    public static int MaxSum(int[] arr) {
7		int ans = Integer.MIN_VALUE;
8		int sum=0;
9		for(int i=0;i<arr.length;i++) {
10			sum+=arr[i];
11			ans=Math.max(ans, sum);
12			if(sum<0) {
13				sum=0;
14			}
15		}
16		return ans;
17    }
18}