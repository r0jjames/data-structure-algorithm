import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int n) {
        //Baseline
        if (n==1) return 1;
        return n * factorial(n-1);
    }

    public static void methodOne() {
        methodTwo();
        System.out.println("Method One");
    }
    public static void methodTwo() {
        methodThree();
        System.out.println("Method Two");
    }
    public static void methodThree() {
        System.out.println("Method Three");
    }
}

