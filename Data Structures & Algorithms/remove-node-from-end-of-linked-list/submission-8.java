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

class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode beforeHead = new ListNode(-1, head);
        ListNode first = beforeHead;
        ListNode second = head;

        for(int i = 0; i < n; i++)
            second = second.next;

        while(second != null)
        {
            second = second.next;
            first = first.next;
        }

        if(first != beforeHead)
            first.next = first.next.next;
        
        else
            head = head.next;

        return head;



    }

    
}
