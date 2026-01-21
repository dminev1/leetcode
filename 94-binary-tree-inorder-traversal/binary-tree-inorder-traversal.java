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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorderTraversalList = new ArrayList<>();
        Stack<TreeNode> treeNodeStack = new Stack<>();
        TreeNode node = root;

        while(node != null || !treeNodeStack.isEmpty()){
            while(node != null){
                treeNodeStack.add(node);
                node = node.left;
            }
            node = treeNodeStack.pop();
            inorderTraversalList.add(node.val);
            node = node.right;
        }

        return inorderTraversalList;
    }
}