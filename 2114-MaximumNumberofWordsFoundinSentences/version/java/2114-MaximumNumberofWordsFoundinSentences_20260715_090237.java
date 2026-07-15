// Last updated: 15/07/2026, 09:02:37
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int maxWords = 0;
4        for (String sentence : sentences) {
5            maxWords = Math.max(maxWords, sentence.split(" ").length);
6        }
7        return maxWords;
8    }
9}