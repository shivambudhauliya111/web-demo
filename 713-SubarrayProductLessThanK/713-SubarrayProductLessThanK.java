// Last updated: 24/06/2026, 14:28:59
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return Product_Less_Than_K(nums ,k);
        }
        public static int Product_Less_Than_K(int[] arr,int k){
            int si=0;
            int ei=0;
            int p=1;
            int ans=0;
            while(ei<arr.length){
                p=p*arr[ei];
                while(p>=k &&  si<=ei){
                    p=p/arr[si];
                    si++;
                }ans=ans+(ei-si+1);
                ei++;
            }return ans;
        }
        
    }
