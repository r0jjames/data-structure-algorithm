class Node {
  constructor(value) {
    this.left = null;
    this.right = null;
    this.value = value;
  }
}

class BinarySearchTree {
  constructor() {
    this.root = null;
  }
  insert(value) {
    //Code here
    const newNode = new Node(value);
    if (this.root === null) {
      this.root = newNode;
    } else {
      let currentNode = this.root;
      while (true) {
        if (value < currentNode.value) {
          //LEFT
          if (!currentNode.left) {
            currentNode.left = newNode;
            console.log("LEFT TRIGGERED");
            return this;
          }
          currentNode = currentNode.left;
        } else {
          // RIGHT
          if (!currentNode.right) {
            currentNode.right = newNode;
            console.log("RIGHT TRIGGERED");
            return this;
          }
          currentNode = currentNode.right;
        }
      }
    }
  }
  insert2(value) {
    const newNode = new Node(value);
    if (this.root === null) {
      this.root = newNode;
    } else {
      let currentNode = this.root;
      while (true) {
        if (value < currentNode.value) {
          //LEFT
          if (!currentNode.left) {
            currentNode.left = newNode;
            return this;
          }
          currentNode = currentNode.left;
        } else {
          //RIGT
          if (!currentNode.right) {
            currentNode.right = newNode;
            return this;
          }
          currentNode = currentNode.right;
        }
      }
    }
  }
  lookup(value) {
    //Code here
  }
  // remove
}

const tree = new BinarySearchTree();
tree.insert2(9);
tree.insert2(4);
tree.insert2(6);
tree.insert2(20);
// tree.insert(170);
// tree.insert(15);
// tree.insert(1);
JSON.stringify(traverse(tree.root));

//     9
//  4     20
//1  6  15  170

function traverse(node) {
  const tree = { value: node.value };
  tree.left = node.left === null ? null : traverse(node.left);
  tree.right = node.right === null ? null : traverse(node.right);
  console.log(tree);
  return tree;
}
