# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        
        res, stk = [], []
        itr: Optional[TreeNode] = root
        cnt: int = 0

        while (itr or stk) and cnt < k:
            while itr:
                stk.append(itr)
                itr = itr.left
            itr = stk.pop()
            res.append(itr.val)
            itr = itr.right

        return res[k-1]



        # # target is in left subtree
        # if root and self.subTreeSize(root.left) >= k:
        #     return self.kthSmallest(root.left, k)

        # # target is root
        # elif root and self.subTreeSize(root.left) == k:
        #     return root.val
        
        # # target is in right subtree
        # elif root:
        #     return self.kthSmallest(root.right, (k - 1 - self.subTreeSize(root.right)))

        # else: 
        #     return 0


    def subTreeSize(self, root: Optional[TreeNode]) -> int:

        if root:
            return 1 + self.subTreeSize(root.left) + self.subTreeSize(root.right)

        return 0