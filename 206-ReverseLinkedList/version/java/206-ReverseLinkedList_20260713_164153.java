// Last updated: 13/07/2026, 16:41:53
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
11class Solution{
12    public ListNode reverseList(ListNode head){
13        return reverse(head,null);
14    }
15    public ListNode reverse(ListNode curr,ListNode perv){
16        if(curr==null){
17            return perv;
18        }
19        ListNode temp=reverse(curr.next,curr);
20        curr.next=perv;
21        return temp;
22    }
23}