// Last updated: 22/07/2026, 23:34:12
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode first = dummy;
16        ListNode second = dummy;
17        for (int i = 0; i < n + 1; i++) {
18            first = first.next;
19        }
20        while (first != null) {
21            first = first.next;
22            second = second.next;
23        }
24        second.next = second.next.next;
25        return dummy.next;
26    }
27}