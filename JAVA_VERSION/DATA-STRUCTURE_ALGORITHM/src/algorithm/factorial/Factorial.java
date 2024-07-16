package algorithm.factorial;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialUsingStreams(4)); // 24
    }
    public static int factorialUsingForLoop(int n) {
        int factorial = 1;
        for (int i=2; i<=n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int factorialUsingRecursion(int n) {
        // base
        if (n==2) {
            return n;
        }

        return n * factorialUsingRecursion(n-1);
    }

    public static int factorialUsingStreams(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
}
