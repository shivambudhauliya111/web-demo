// Last updated: 14/07/2026, 12:37:01
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
12    public ListNode sortList(ListNode head) {
13        	    	if(head == null || head.next==null) {
14		    		return head;
15		    	}
16		    	ListNode mid = middleNode(head);
17		    	ListNode midnext = mid.next;
18		    	 mid.next = null;
19		    	 ListNode A = sortList(head);
20		    	 ListNode B=sortList(midnext);
21		    	 return mergeTwoLists(A,B);
22		    	
23		    }
24		    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
25		    	ListNode Dummy = new ListNode();
26		    	ListNode temp = Dummy;
27		    	while(list1 != null && list2 != null) {
28		    	if(list1.val<=list2.val) {
29		    		Dummy.next=list1;
30		    		list1=list1.next;
31		    		Dummy=Dummy.next;
32		    	}
33		    	else {
34		    		Dummy.next=list2;
35		    		list2=list2.next;
36		    		Dummy=Dummy.next;
37		    	}
38		    	}
39		    	if(list1 == null) {
40		    		Dummy.next= list2;
41		    	}
42		    	if(list2==null) {
43		    		Dummy.next= list1;
44		    		
45		    	}
46		    	return temp.next;
47		    	}
48		    public ListNode middleNode(ListNode head) {
49				ListNode slow=head;
50				ListNode fast=head;
51				while(fast.next!=null && fast.next.next !=null) {
52					slow=slow.next;
53					fast=fast.next.next;
54				}
55				return slow;
56			}
57		    }
58        
59    
60