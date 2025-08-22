// Last updated: 8/22/2025, 4:44:46 PM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans =  new ArrayList<>();
        int carry = 0;
        int i = num.length-1;
        while( i >= 0 || k>0 ){
            int numval = 0;
            if(i>=0){
             numval = num[i];
            }
            int d = k%10;
            int sum= numval +d+carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);
            i--;
            k = k/10;
        }
        if(carry>0){
            ans.add(carry);

        }

        Collections.reverse(ans);
        return ans;

    } 
    }
    