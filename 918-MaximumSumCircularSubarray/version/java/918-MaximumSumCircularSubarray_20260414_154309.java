// Last updated: 14/04/2026, 15:43:09
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        return MaxmumSum(nums);
4    }
5
6        	public static int MaxmumSum(int[] arr) {
7		int linear_sum=Kadens_Algo(arr);
8		int sum =0;
9		for(int i=0;i<arr.length;i++) {
10			sum=sum+arr[i];
11			arr[i]=arr[i]*-1;
12		}
13		int mid = Kadens_Algo(arr);
14		int Circular_sum=sum+mid;//circular sum
15        if(Circular_sum==0){
16            return linear_sum;
17        }
18		return Math.max(linear_sum, Circular_sum);
19	}
20	public static int Kadens_Algo(int[] arr) {
21		int ans=Integer.MIN_VALUE;
22		int sum=0;
23		for(int i=0;i<arr.length;i++) {
24			sum+= arr[i];
25			ans=Math.max(ans, sum);
26			if(sum<0) {
27				sum=0;
28			}
29		}
30		return ans;
31		
32	}
33}