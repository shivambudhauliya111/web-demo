// Last updated: 11/02/2026, 23:23:39
1class Solution {
2    public String frequencySort(String s) {
3        int[] freq = new int[128]; // ASCII
4        for (char c : s.toCharArray()) {
5            freq[c]++;
6        }
7        List<Character>[] buckets = new ArrayList[s.length() + 1];
8        for (int i = 0; i < buckets.length; i++) {
9            buckets[i] = new ArrayList<>();
10        }
11
12        for (int i = 0; i < 128; i++) {
13            if (freq[i] > 0) {
14                buckets[freq[i]].add((char) i);
15            }
16        }
17
18        StringBuilder sb = new StringBuilder();
19        for (int i = buckets.length - 1; i > 0; i--) {
20            for (char c : buckets[i]) {
21                for (int j = 0; j < i; j++) {
22                    sb.append(c);
23                }
24            }
25        }
26        return sb.toString();
27    }
28}
29