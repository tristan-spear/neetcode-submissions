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
        if(head == null)
            return false;
        
        ListNode tortoise = head;
        ListNode hare = head.next;

        while(hare != null)
        { 
            if(hare != tortoise)
            {
                hare = hare.next;
                tortoise = tortoise.next;
            }
            else
                return true;

            if(hare != null && hare != tortoise)
            {
                hare = hare.next;
            }
            else if(hare != null)
                return true;
        }
        return false;
    }
}
