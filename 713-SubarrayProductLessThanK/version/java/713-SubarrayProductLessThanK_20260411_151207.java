// Last updated: 11/04/2026, 15:12:07
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        return Product_Less_Than_K(nums ,k);
4        }
5        public static int Product_Less_Than_K(int[] arr,int k){
6            int si=0;
7            int ei=0;
8            int p=1;
9            int ans=0;
10            while(ei<arr.length){
11                p=p*arr[ei];
12                while(p>=k &&  si<=ei){
13                    p=p/arr[si];
14                    si++;
15                }ans=ans+(ei-si+1);
16                ei++;
17            }return ans;
18        }
19        
20    }
21