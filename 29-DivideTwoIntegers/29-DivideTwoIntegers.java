// Last updated: 8/22/2025, 4:45:45 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648&&divisor == -1){
            return  2147483647;
        }
      int x=dividend/divisor;
      return x;

        
    }
}