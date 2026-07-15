// Last updated: 15/07/2026, 09:20:37
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int maxWords = 0;
4        for (String sentence : sentences) {
5            int words = 1;
6            for (int i = 0; i < sentence.length(); i++) {
7                if (sentence.charAt(i) == ' ') {
8                    words++;
9                }
10            }
11            maxWords = Math.max(maxWords, words);
12        }
13        return maxWords;
14    }
15}