// Last updated: 11/16/2025, 4:37:02 PM
class Solution {
    public void rotate(int[] nums, int k) {
     RotateArray(nums,k);
        
    }
public static void RotateArray(int[] arr,int k) {
	int n= arr.length;
	k=k%n;
	Revese(arr,0,n-1);
	Revese(arr,0,k-1);
	Revese(arr,k,n-1);
}
public static void Revese(int[] arr,int i,int j) {
	while(i <j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
}