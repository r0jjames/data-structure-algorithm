package datastructure.linkedlist;


public class DoublyLinkedList {
    private int length;
    Node head;
    Node tail;
    class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int value) {
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

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length++;
    }
    public void printList() {
        Node temp = this.head;
        while(temp!= null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
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

    public void append(int value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
            this.length++;
        }

    }
    public boolean insert(int index, int value) {
        Node newNode = new Node(value);
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node current = get(index);
        Node prev = current.getPrev();
        newNode.setNext(current);
        newNode.setPrev(prev);
        current.setPrev(newNode);
        prev.setNext(newNode);
        this.length++;
        return true;
    }
    public Node remove(int index) {
        Node current = get(index);

        if(index == 0) {
            return this.removeFirst();
        }
        if(index == this.length-1) {
            return this.removeLast();
        }
        current.getNext().getPrev().setPrev(current.getPrev());
        current.getPrev().setNext(current.getNext());
        current.setNext(null);
        current.setPrev(null);
        this.length--;
        return current;
    }
    public Node get(int index) {
        Node temp = this.head;
        if (index < 0 || index > length) return null;

        if(index < length/2) {
            for (int i=0; i < index; i++) {
                temp = temp.getNext();
            }
        } else {
            temp = this.tail;
            for(int i = length-1; i > index; i--) {
                temp = temp.getPrev();
            }
        }
        return temp;
    }
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public Node removeFirst() {
        Node temp = this.head;
        if(this.length == 0) return null;
        if(this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
            this.head.prev = null;
            temp = null;
            this.length--;
        }
        return  temp;
    }
    public Node removeLast() {
        Node temp = this.tail;
        if(this.length == 0) return null;
        if(this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.setNext(null);
        }

        this.length--;

        return temp;

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
