package datastructure.stack;

public class StackMain {
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
}
