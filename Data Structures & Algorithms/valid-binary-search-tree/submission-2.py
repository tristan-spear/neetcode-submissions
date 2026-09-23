# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        
        return helper(root, [-1000000001, 1000000001])


def helper(root: Optional[TreeNode], minMax: tuple[int, int]) -> bool:

    if root:
            
            if (not root.left or (root.left.val < root.val and root.left.val > minMax[0])) and (not root.right or (root.right.val > root.val and root.right.val < minMax[1])):

                return helper(root.left, [minMax[0], root.val]) and helper(root.right, [root.val, minMax[1]])

            else: 

                return False
    
    return True