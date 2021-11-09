class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }

            ans++;
        }
        return ans;
    }
}
