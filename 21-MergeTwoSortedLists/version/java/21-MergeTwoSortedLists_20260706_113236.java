// Last updated: 06/07/2026, 11:32:36
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        if(list1 == null){
14            return list2;
15        }
16        if(list2 == null){
17            return list1;
18        }
19        if(list1.val<=list2.val){
20          list1.next = mergeTwoLists(list1.next,list2);
21          return list1;
22        }
23        else{
24            list2.next = mergeTwoLists(list1,list2.next);
25            return list2;
26        }
27        
28    }
29}