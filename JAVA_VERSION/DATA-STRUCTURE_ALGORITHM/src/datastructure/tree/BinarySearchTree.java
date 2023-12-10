package datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;
    class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
    public boolean insert(int value) {
        Node newNode = new Node(value);
        Node temp = this.root;
        if(this.root == null) {
            this.root = newNode;
            return true;
        }
        while(true) {
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value) {
                // Move to the left node
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    private Node rInsert(Node node, int value) {
        if(node == null) {
            return new Node(value);
        }
        if(value < node.value) {
            node.left = rInsert(node.left, value);
        } else {
            node.right = rInsert(node.right, value);
        }
        return node;
    }
    public void rInsert(int value) {
        if(root == null) {
            root = new Node(value);
        } else {
            rInsert(root, value);
        }

    }

    public boolean contains(int value) {
        Node temp = this.root;
        //Base class
        while (temp != null) {
            if(value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
    public boolean rContains(Node node, int value) {
        if(node == null) return false;
        if(node.value == value) return true;

        if(value < node.value) {
            return rContains(node.left, value);
        } else{
            return rContains(node.right, value);
        }
    }
    public boolean rContains(int value) {
        return rContains(root, value);
    }

    public Node getRoot() {
        return root;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }
    private Node deleteNode(Node currentNode, int value) {
        if(currentNode == null) return null;

        if(value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if(currentNode.left == null & currentNode.right == null) {
                return null;
            } else if(currentNode.left == null) {
                currentNode = currentNode.right;
            } else if(currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subtreeMin = minValue(currentNode.right);
                currentNode.value = subtreeMin;
                currentNode.right = deleteNode(currentNode.right, value);
            }
        }
        return currentNode;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = this.root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

      while (queue.size() > 0) {
          currentNode = queue.remove();
          results.add(currentNode.value);
          if(currentNode.left != null) {
              queue.add(currentNode.left);
          }
          if(currentNode.right != null) {
              queue.add(currentNode.right);
          }
      }
      return results;
    }
    public int minValue(Node node) {
        while(node.left != null ) {
            node = node.left;
        }
        return node.value;
    }
    public ArrayList DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {

            Traverse(Node node) {
                results.add(node.value);
                if(node.left != null) {
                    new Traverse(node.left);
                }
                if(node.right != null) {
                    new Traverse(node.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    public ArrayList DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node node) {
                if(node.left != null) {
                    new Traverse(node.left);
                }
                if(node.right != null ) {
                    new Traverse(node.right);
                }
                results.add(node.value);
            }
        }
        new Traverse(root);
        return results;
    }
    public ArrayList DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node node) {
                if(node.left != null) {
                    new Traverse(node.left);
                }
                results.add(node.value);
                if(node.right != null ) {
                    new Traverse(node.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

}

