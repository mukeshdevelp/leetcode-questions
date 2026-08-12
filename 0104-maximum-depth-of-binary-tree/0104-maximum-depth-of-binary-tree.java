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
    // initialize the level by 0
    int level = 0;
    public int maxDepth(TreeNode root) {
        // if root is null return 0 because tree is empty
        if (root == null){ return 0;}
        
        level+=1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }
}