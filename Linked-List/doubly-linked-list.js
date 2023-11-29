class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}


class DoublyLinkedList {
    constructor(value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }
    append(value) {
        const newNode = new Node(value);
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
        // console.log(this);
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
        console.log(arr);
        return arr;
    }
    insert(index, value) {
        const newNode = new Node(value);
        const leader = this.traverseToIndex(index-1);
        const follower = leader.next;
        leader.next = newNode;
        newNode.prev = leader;
        newNode.next = follower;
        follower.prev = newNode;
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
    reverse() {
        console.log('Before.......');
        console.log(this);
        if (!this.head.next) {
            return this.head;
        }
        let first = this.head;
        this.tail = this.head;
        let second = first.next;
        while(second) {
            // console.log(second);
            const third = second.next;
            second.next = first;
            first = second;
            second = third;
        }
        this.head.next = null;
        this.head = first;
        console.log('After.......');
        console.log(this);
        return this;
    }

    

}

const myLinkedList = new DoublyLinkedList(1);
myLinkedList.append(2);
myLinkedList.append(3);
// myLinkedList.append(17);
// myLinkedList.insert(2, 100);
// myLinkedList.remove(1);
// myLinkedList.prepend(1);
// myLinkedList.printList();
// console.log(myLinkedList);
myLinkedList.reverse();