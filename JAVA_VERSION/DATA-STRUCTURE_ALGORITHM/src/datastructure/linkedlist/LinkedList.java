package datastructure.linkedlist;

class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.length++;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;

    }
    public Node removeLast() {
        Node temp = this.head;
        Node pre = this.head;
        if(this.length == 0) {
            this.head = null;
            this.tail = null;
            return null;
        }
        while(temp.getNext() != null) {
            pre = temp;
            temp = temp.getNext();
        }
        this.tail = pre;
        this.tail.setNext(null);
        this.length--;
        return pre;
    }
    public Node removeFirst() {
        if(this.length == 0) {
            this.tail = null;
        }
        Node temp = this.head;
        this.head = this.head.getNext();
        temp.setNext(null);
        this.length--;
        return temp;
    }
    public Node remove(int index){
        if(index < 0 || index > length) return null;
        if(index == 0) return removeFirst();
        if(index == length -1) return removeLast();

        Node prev = get(index-1);
        Node current = prev.getNext();
        prev.setNext(current.getNext());
        current.setNext(null);
        this.length--;
        return current;
    }
    public Node get(int index) {
        if(index < 0 || index > this.length) {
            return null;
        }
        Node temp = this.head;
        for(int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }
    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.setValue(value);
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value) {
        if(index < 0 || index > this.length) {
            return false;
        }
        if(index == 0) { // Insert to the head
            prepend(value);
            return true;
        }
        if(index == length) { // Insert to the tail
            append(value);
            return true;
        }
        Node newNode = new Node(value);

        Node prevNode = get(index-1); // Get Previous Node;
        newNode.setNext(prevNode.getNext()); // Point the New Node to the temp pointer
        prevNode.setNext(newNode);// Reconnect the Previous pointers to the NewNode
        this.length++;
        return true;
    }
    public void reverse() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        Node after;
        Node before = null;
        for(int i=0; i < this.length; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
        }
    }
    public void reverse2() {
        Node current = this.head;
        this.head = this.tail;
        this.tail = current;
        Node after;
        Node prev = null;
        while(current != null) {
            after = current.getNext();
            current.setNext(prev);
            prev = current;
            current = after;
        }

    }


    public void printList() {
        Node temp = this.head;
        while(temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public void getHead() {
        System.out.println("Head: " + this.head.getValue());
    }

    public void getTail() {
        System.out.println("Tail: " + this.tail.getValue());
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }
}
