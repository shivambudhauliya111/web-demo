// Last updated: 8/22/2025, 4:45:36 PM
import java.math.BigInteger;  

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n = new BigInteger(num1);
      BigInteger m = new BigInteger(num2);
       
        BigInteger product = n.multiply(m);  
        String result = product.toString();
        
        return result;
    
      
    }
}