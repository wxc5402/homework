class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retList = new ArrayList();
        inOrder(root, retList);
        return retList;
    }

    private void inOrder (TreeNode root, List<Integer> list) {
        if( root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);

    }
}
