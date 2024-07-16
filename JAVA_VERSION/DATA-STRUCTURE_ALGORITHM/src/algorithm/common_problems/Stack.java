package algorithm.common_problems;
// practice stack
public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // push
    public void push(int value) {
        if (isFull()) {
            System.out.println("Full");
            return;
        }
        this.stackArray[++top] = value;
        System.out.println("Pushed element " + top + " onto the stack.");
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int poppedValue = stackArray[top--];
        System.out.println("Popped element " + poppedValue + " onto the stack.");
        return poppedValue;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int value = this.stackArray[top];
//        System.out.println("Top element of the stack: " + value);
        return value;
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
