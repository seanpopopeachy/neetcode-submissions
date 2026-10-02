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
        Node cur = head;
        Map<Node, Node> oldToCopy = new HashMap<>();

        while(cur != null) {
            Node copy = new Node(cur.val);
            oldToCopy.put(cur, copy);
            cur = cur.next;
        }

        cur = head;

        while(cur != null) {
            Node copy = oldToCopy.get(cur);
            copy.next = oldToCopy.get(cur.next);
            copy.random = oldToCopy.get(cur.random);
            cur = cur.next;
        }

        return oldToCopy.get(head);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
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
        */
    }
}
