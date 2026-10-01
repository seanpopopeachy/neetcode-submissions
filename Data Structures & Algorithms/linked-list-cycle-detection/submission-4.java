/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null) {
            slow = slow.next;
            if(fast.next == null) {
                return false;
            } else {
                fast = fast.next.next;
            }
          
            if(fast == slow) return true;
        }

        return fast == slow;
    }
}

/*
    fast pointer: moves by 2 spaces
    slow pointer: moves by 1 space
    return false if fast pointer is null
    return true if slow == fast
*/