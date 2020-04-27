public class findClosetValueBST {
    public static int findClosetValueInBst(BinarySearchTree.BST tree, int target, double closet){
        BinarySearchTree.BST currentNode = tree;
        while(currentNode != null){
            if(Math.abs(target-closet) > Math.abs(target-currentNode.value)){
                closet = currentNode.value;
            }
            if(target < currentNode.value){
                currentNode = currentNode.left;
            }
            else if(target > currentNode.value){
                currentNode = currentNode.right;
            }
            else{
                break;
            }
        }
        return (int) closet;
    }
}
