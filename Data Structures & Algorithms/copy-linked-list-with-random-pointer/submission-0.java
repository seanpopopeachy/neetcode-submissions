/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Map<Node, Node> randoms = new HashMap<>();
        randoms.put(null, null);

        while(curr != null) {
            Node copy = new Node(curr.val);
            randoms.put(curr, copy);
            curr = curr.next;
        }

        curr = head;
        while(curr != null) {
            Node copy = randoms.get(curr);
            copy.next = randoms.get(curr.next);
            copy.random = randoms.get(curr.random);
            curr = curr.next;
        }

        return randoms.get(head);
    }
}
