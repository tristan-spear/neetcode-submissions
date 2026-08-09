/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(root != null)
        {
            return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        return false;
    }

    public boolean isSameTree(TreeNode one, TreeNode two)
    {
        if(one != null && two != null)
        {
            if(one.val == two.val)
                return isSameTree(one.left, two.left) && isSameTree(one.right, two.right);
            
            else
                return false;
        }
        else if(one != null || two != null)
            return false;

        return true;
    }
}
