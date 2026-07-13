// Last updated: 13/07/2026, 23:21:43
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode v =headA;
15        ListNode vgf = headB;
16        while(v != vgf){
17            if(v == null){
18                v = headB;
19            }else{
20                v=v.next;
21            }
22            if(vgf == null){
23                vgf = headA;
24            }else{
25                vgf=vgf.next;
26            }
27            
28        }return v;
29    }
30}
31