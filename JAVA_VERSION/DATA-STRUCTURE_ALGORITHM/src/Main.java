import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        input.add(50);


        // Iterating using for each loop
        for (Integer element : input) {
            // Print the corresponding element
            System.out.println("Element : " + element);
        }
        System.out.println("-------");
        System.out.println("Stack Pop: " + input.peek());
        while(!input.isEmpty()) {
            output.add(input.pop());
        }
        // Iterating using for each loop
        for (Integer element : output) {
            // Print the corresponding element
            System.out.println("Element : " + element);
        }
        System.out.println("Stack Pop: " + output.peek());
    }


}

