class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
    
        int min_dep = Integer.MAX_VALUE;
        if (root.left != null) {
            min_dep = Math.min(minDepth(root.left), min_dep);
        }
        
        if (root.right != null) {
            min_dep = Math.min(minDepth(root.right), min_dep);
        }

        return min_dep + 1;
    }
}
