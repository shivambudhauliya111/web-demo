// Last updated: 8/22/2025, 4:45:02 PM
class Solution {
    public String reverseVowels(String s) {
        char st[] = s.toCharArray();
        int left=0;
        int right=st.length-1;
        while(left<right){
            if(isvowel(st[left])==false){
                left++;
            }
            else if(isvowel(st[right])==false){
                right--;
            }
            else {
                char temp = st[left];
                st[left] = st[right];
                st[right] = temp;
                left++;
                right--;
            }
        }
        return new String (st);
    }
    public boolean isvowel (char s){
        if(s=='a'|| s=='e' || s=='i' || s=='o' || s=='u' || s=='A' ||s=='E' || s=='I' || s=='O' || s=='U'){
            return true;
        }
        return false;
    }
}