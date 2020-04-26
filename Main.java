public class Main {
    public static void main(String[] args) {
        BinarySearchTree.BST b = new BinarySearchTree.BST(20);
        System.out.println(b.insert(10));
        System.out.println(b.contains(10));
        System.out.println(b.contains(30));

    }
}
