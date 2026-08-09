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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode a;
        ListNode b;
        ListNode c;
        ListNode head;

        if(list1.val <= list2.val)
        {
            head = list1;
            a = list1;
            b = list2;
        }
        else
        {
            head = list2;
            a = list2;
            b = list1;
        }
        //c = b;

        while(a.next != null && b != null)
        {
            if(a.next.val <= b.val)
            {
                a = a.next;
            }
            else
            {
                c = b.next;
                b.next = a.next;
                a.next = b;
                b = c;
                a = a.next;
            }
        }

        if(b != null)
            a.next = b;


        return head;
    }

}