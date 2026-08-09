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

    // int[] newList;
    // int ctr = 0;
    // boolean initialized = false;

    // public void initialize(int size)
    // {
    //     newList = new int[size];
    // }
    
    // public void addElement(int val)
    // {
    //     newList[newList.length - ctr] = val;
    //     --ctr;
    // }

    public ListNode reverseList(ListNode head) {
        
        // ListNode first = head;
        // ListNode second = null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }
}

