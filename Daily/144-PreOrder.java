class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> retList = new ArrayList();
        preOrder(root, retList);
        return retList;
    }

    private void preOrder (TreeNode root, List<Integer> list) {
        if( root == null) {
            return;
        }

        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);

    }
}
