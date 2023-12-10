package datastructure.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        private int value;
        private Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Queue(int value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length++;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    public Node dequeue() {
        Node temp = this.first;
        if(this.length == 0) {
            return null;
        }
        else if(length == 1) {
            this.first = null;
            this.last = null;
        } else {
            this.first = temp.next;
            temp.next = null;
        }
        this.length--;
        return temp;

    }

    public void printQueue() {
        Node temp = this.first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + this.first.value);
    }

    public void getLast() {
        System.out.println("Last: " + this.last.value);
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }
}
