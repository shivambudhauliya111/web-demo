// Last updated: 1/19/2026, 11:18:33 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target){
3        return Search(matrix,target);
4    }
5        public static boolean Search(int[][]arr,int item){
6            int r=0;
7            int c=arr[0].length-1;
8            while(r<arr.length&&c>=0){
9                if(arr[r][c]==item){
10                    return true;
11                }else if(arr[r][c]>item){
12                    c--;
13
14                }else{
15                    r++;
16                }
17            }return false;
18                    }
19    }