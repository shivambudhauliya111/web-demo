// Last updated: 8/22/2025, 4:45:12 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<1){
            return false;
        }else if(n==1){
            return true;
        }else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;

            }else{
                return false;
            }
        }
        
    }
}