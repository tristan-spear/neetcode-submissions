# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        
        end = head.next
        mid = head

        while end != None:
            
            # move mid forward 1
            mid = mid.next

            # move end forward 2
            end = end.next
            if end != None: 
                end = end.next

        temp = mid.next
        mid.next = None
        l2 = reverseList(temp)
        itr = head

        while l2 != None:
            temp1 = itr.next
            temp2 = l2.next
            itr.next = l2
            itr = temp1
            l2.next = temp1
            l2 = temp2

            

def reverseList(head: Optional[ListNode]):

    prev = None
    curr = head
    
    while curr != None: 
        
        temp = curr.next
        curr.next = prev
        prev = curr
        curr = temp

    return prev
    


