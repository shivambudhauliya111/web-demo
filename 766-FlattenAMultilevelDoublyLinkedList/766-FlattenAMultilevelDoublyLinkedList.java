// Last updated: 8/22/2025, 4:44:53 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        Node dummy = new Node();
        dummy.next = head;
        Node prev = dummy;
        flattenDFS(prev, head);
        dummy.next.prev = null;
        return dummy.next;
    }
    private Node flattenDFS(Node prev, Node curr) {
        if (curr == null) return prev;
        curr.prev = prev;
        prev.next = curr;
        Node tempNext = curr.next;
        Node tail = flattenDFS(curr, curr.child);
        curr.child = null;
        return flattenDFS(tail, tempNext);
    }
}