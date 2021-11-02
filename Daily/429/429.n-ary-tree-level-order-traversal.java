class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
    
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> li = new ArrayList<Integer>();
            int len = queue.size();            
            for (int index = 0 ; index < len; index++) {
                Node node = queue.poll();
                li.add(node.val);
                //for (Node no : node.children) {
                 //   queue.add(no);
                queue.addAll(node.children);
                //}
            }
            list.add(li);
        }

        return list;
    }
}
