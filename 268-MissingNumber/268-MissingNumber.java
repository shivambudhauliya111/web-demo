// Last updated: 8/22/2025, 4:45:07 PM
class Solution {
    public int missingNumber(int[] a) {
          for(int i=0;i<=a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    c=1;
                }

            }
            if(c==0){
                return i;
            }

}   return -1;  
 }
}
