// Last updated: 24/06/2026, 14:28:53
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return MaxmumSum(nums);
    }

        	public static int MaxmumSum(int[] arr) {
		int linear_sum=Kadens_Algo(arr);
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			arr[i]=arr[i]*-1;
		}
		int mid = Kadens_Algo(arr);
		int Circular_sum=sum+mid;//circular sum
        if(Circular_sum==0){
            return linear_sum;
        }
		return Math.max(linear_sum, Circular_sum);
	}
	public static int Kadens_Algo(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
		
	}
}