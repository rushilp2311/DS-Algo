public class NodeDepths {
    static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }
   public static int nodeDepths(BinaryTree root){
       return nodeDepthsHelper(root,0);
   }
   public static int nodeDepthsHelper(BinaryTree root, int depth){
        if(root == null) return 0;
        return depth + nodeDepthsHelper(root.left,depth+1)+nodeDepthsHelper(root.right,depth+1);
   }
}
