package week7;

public class HeadTailRecursion {

    // Head recursion
    static void headRecursion(int n) {

        if (n == 0) {
            return;
        }

        headRecursion(n - 1);

        System.out.print(n + " ");
    }

    // Tail recursion
    static void tailRecursion(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        tailRecursion(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Head Recursion:");
        headRecursion(5);

        System.out.println("\n\nTail Recursion:");
        tailRecursion(5);
    }
}