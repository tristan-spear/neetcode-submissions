# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:

    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        
        q = deque()
        if root: q.append(root)
        output = []

        while q:

            lst = []
            length = len(q)

            for i in range(length):

                tmp = q.popleft()
                lst.append(tmp.val)

                if tmp.left:
                    q.append(tmp.left)
                
                if tmp.right:
                    q.append(tmp.right)

            output.append(lst)

        return output




