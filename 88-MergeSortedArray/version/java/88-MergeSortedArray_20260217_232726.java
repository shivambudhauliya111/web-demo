// Last updated: 17/02/2026, 23:27:26
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4        int i = m - 1;        
5        int j = n - 1;        
6        int k = m + n - 1;    
7        
8        while (i >= 0 && j >= 0) {
9            if (nums1[i] > nums2[j]) {
10                nums1[k] = nums1[i];
11                i--;
12            } else {
13                nums1[k] = nums2[j];
14                j--;
15            }
16            k--;
17        }
18        while (j >= 0) {
19            nums1[k] = nums2[j];
20            j--;
21            k--;;
22        }
23    }
24}
25