package datastructure.tree;

public class TreeMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
         /* Binary Search Tree
                    47
                21      76
             18   27  52  82
         */

        binarySearchTree.rInsert(47);
        binarySearchTree.rInsert(21);
        binarySearchTree.rInsert(76);
        binarySearchTree.rInsert(18);
        binarySearchTree.rInsert(52);
        binarySearchTree.rInsert(27);
        binarySearchTree.rInsert(82);
//        System.out.println(binarySearchTree.DFSPreOrder()); // [47, 21, 18, 27, 76, 52, 82]
//        System.out.println(binarySearchTree.DFSInOrder()); // [18, 21, 27, 47, 52, 76, 82]
//        System.out.println(binarySearchTree.DFSPostOrder()); // [18, 27, 21, 52, 82, 76, 47]

        System.out.println(binarySearchTree.BFS()); // [47, 21, 76, 18, 27, 52, 82]
//        binarySearchTree.deleteNode(52);
//        System.out.println(binarySearchTree.minValue(binarySearchTree.getRoot().getRight()));
//        System.out.println(binarySearchTree.rContains(28));
//        System.out.println(binarySearchTree.contains(100));
//        System.out.println(binarySearchTree.getRoot().getRight().getLeft().getValue()); // 52
//        System.out.println(binarySearchTree.getRoot().getLeft().getRight().getValue()); // 27
    }
}
