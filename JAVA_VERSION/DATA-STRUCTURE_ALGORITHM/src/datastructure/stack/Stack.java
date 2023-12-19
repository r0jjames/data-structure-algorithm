package datastructure.stack;

public class Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.getTop();
        stack.getHeight();
        System.out.println("--Print Stack--");
        stack.printStack();
    }
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
        this.height++;
    }
    public void push(int value) {
        Node newNode = new Node(value);
        if(this.height == 0) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
        this.height++;
    }
    public Node pop() {
        if(this.height == 0) return null;
        Node temp = this.top;
        this.top = temp.next;
        temp.next = null;
        this.height--;
        return temp;

    }

    public void printStack() {
        Node temp = this.top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop() {
        System.out.println("Top: " + this.top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + this.height);
    }
}
