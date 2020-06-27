public class SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val = val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return false;
        if(q ==null || p==null)return false;
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);

    }
}
