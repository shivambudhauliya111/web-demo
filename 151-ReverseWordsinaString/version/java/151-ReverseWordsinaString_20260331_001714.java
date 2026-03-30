// Last updated: 31/03/2026, 00:17:14
1class Solution {
2    public String reverseWords(String s) {
3        return Reverse_Words(s);
4    }
5    public static String Reverse_Words(String s) {
6        s = s.trim();
7        String[] arr = s.split("\s+");
8		String ans="";
9        for(int i=arr.length-1;i>=0;i--){
10         ans=ans + arr[i]+" ";
11}
12return ans.trim();
13    
14    }
15}