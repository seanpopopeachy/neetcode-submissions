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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> sol = new ArrayList<>();
        queue.add(root);
        if(root == null) return sol;

        int levelSize = 0;

        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            levelSize = queue.size();

            for(int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove();
                level.add(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);


            }

            sol.add(level);
        }

        return sol;
    }
}
