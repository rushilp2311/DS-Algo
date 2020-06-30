public class BST {

    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }
    public BST insert (int value){
        if(value < this.value){
            if(left!=null) this.left.insert(value);
            else{
                BST newNode = new BST(value);
                this.left = newNode;
            }
        }
        else{
            if(right != null) this.right.insert(value);
            else{
                BST newNode = new BST(value);
                this.right = newNode;
            }
        }
        return this;
    }
    public boolean contains(int value){
        if(this.value == value){
            return true;
        }
        else{
            if(value < this.value){
                if(this.left != null) return left.contains(value);
                else return false;
            }
            else{
                if(this.right != null) return right.contains(value);
                else return false;
            }
        }
    }
    public BST remove(int value){
        remove(value,null);
        return this;
    }
    public void remove(int value, BST parentNode){
        BST currentNode = this;
        while(currentNode != null){
            if(value < currentNode.value){
                parentNode = currentNode;
                currentNode = currentNode.left;
            }
            else if(value > currentNode.value){
                parentNode = currentNode;
                currentNode = currentNode.right;
            }
            else{
//                if(currentNode.left != null && currentNode.right != null){
//                    currentNode.value = currentNode.right.getMinValue();
//                    currentNode.right.remove(currentNode.value,currentNode);
//                }
//                else if(parentNode == null){
//                    if(currentNode.left != null){
//                        currentNode.value = currentNode.left.value;
//                        currentNode.right = currentNode.left.right;
//                    }
//                }
            }
        }
    }

}
