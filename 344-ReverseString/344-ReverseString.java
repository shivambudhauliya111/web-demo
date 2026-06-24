// Last updated: 24/06/2026, 14:29:08
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for (int i=0;i<n/2;i++){
            char ch = s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=ch;
        }
        
    }
}