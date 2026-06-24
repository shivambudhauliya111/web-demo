// Last updated: 24/06/2026, 14:29:15
class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        return Search(matrix,target);
    }
        public static boolean Search(int[][]arr,int item){
            int r=0;
            int c=arr[0].length-1;
            while(r<arr.length&&c>=0){
                if(arr[r][c]==item){
                    return true;
                }else if(arr[r][c]>item){
                    c--;

                }else{
                    r++;
                }
            }return false;
                    }
    }