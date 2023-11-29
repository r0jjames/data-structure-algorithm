class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}


class LinkedList {
    constructor(value) {
        this.head = {
            value: value,
            next: {}
        }
        this.tail = this.head;
        this.length = 1;
    }
    append(value) {
        const newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
        return this;
    }
    prepend(value) {
        const newNode = new Node(value);
         newNode.next = this.head;
         this.head = newNode;
         this.length++;
         return this;
    }
    printList() {
        const arr = [];
        let currentNode = this.head;
        while(currentNode != null) {
            arr.push(currentNode.value);
            currentNode = currentNode.next;
        }
        return arr;
        
    }
    insert(index, value) {
        const newNode = new Node(value);
        const leader = this.traverseToIndex(index-1);
        const follower = leader.next;
        leader.next = newNode;
        newNode.prev
        newNode.next = follower;
        this.length++;
        return this.printList();

    }

    remove(index) {
        const leader = this.traverseToIndex(index-1);
        const unwantedNode = leader.next;
        leader.next = unwantedNode.next;
        this.length--;
        return this;
    }
    traverseToIndex(index) {
        let counter = 0;
        let currentNode = this.head;
        while(counter !== index) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

}

const myLinkedList = new LinkedList(10);
myLinkedList.append(5);
myLinkedList.append(16);
myLinkedList.append(17);
myLinkedList.insert(2, 100);
myLinkedList.remove(1);
// myLinkedList.prepend(1);
myLinkedList.printList();
// console.log(myLinkedList);