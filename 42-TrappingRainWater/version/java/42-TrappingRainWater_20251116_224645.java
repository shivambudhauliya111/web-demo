// Last updated: 11/16/2025, 10:46:45 PM
class Solution {
    public int trap(int[] height) {
        return Trapping(height);
        
    }
    public static int Trapping(int[] arr) {
	 int n=arr.length;
	 int[] left=new int[n];
	 left[0] = arr[0];
	 for(int i =1; i<left.length;i++) {
		 left[i]=Math.max(left[i-1],arr[i]);
	 }
	 int[] right = new int[n];
	 right[n-1]=arr[n-1];
	 for(int i=n-2;i>=0;i--) {
		 right[i]=Math.max(right[i+1],arr[i]);
	 }
	 int sum=0;
	 for(int i=0;i<right.length;i++) {
		 sum=sum+Math.min(left[i],right[i])-arr[i];
	 }
	 return sum;
 }
}