// Last updated: 21/02/2026, 23:34:46
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode dummy = new ListNode();
4        ListNode cur = dummy;
5        int carry = 0;
6        while (l1 != null || l2 != null || carry != 0) {
7            int sum = carry;
8            if (l1 != null) {
9                sum += l1.val;
10                l1 = l1.next;
11            }
12            if (l2 != null) {
13                sum += l2.val;
14                l2 = l2.next;
15            }
16            carry = sum / 10;
17            cur.next = new ListNode(sum % 10);
18            cur = cur.next;
19        }
20        return dummy.next;
21    }
22}