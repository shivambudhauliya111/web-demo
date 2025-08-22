// Last updated: 8/22/2025, 4:44:45 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int flag=0;
        for(int i=arr.length-1;i>=0;i--){
            flag=max;
            if(arr[i]>max) max=arr[i];
            arr[i]=flag;
        }
        return arr;
    }
}