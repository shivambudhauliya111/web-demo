// Last updated: 24/06/2026, 14:29:29
class Solution {
    public String reverseWords(String s) {
        return Reverse_Words(s);
    }
    public static String Reverse_Words(String s) {
        s = s.trim();
        String[] arr = s.split("\s+");
		String ans="";
        for(int i=arr.length-1;i>=0;i--){
         ans=ans + arr[i]+" ";
}
return ans.trim();
    
    }
}