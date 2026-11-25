package week14;


public class SumNodesLongestPath {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int maxSum = 0;
    static int maxLength = 0;

    public static int solve(Node root) {

        maxSum = 0;
        maxLength = 0;

        findSum(root, 0, 0);

        return maxSum;
    }

    public static void findSum(Node root, int sum, int length) {

        if (root == null) {
            return;
        }

        sum += root.data;
        length++;

        if (root.left == null && root.right == null) {

            if (length > maxLength) {
                maxLength = length;
                maxSum = sum;
            }

            else if (length == maxLength) {
                maxSum = Math.max(maxSum, sum);
            }

            return;
        }

        findSum(root.left, sum, length);

        findSum(root.right, sum, length);
    }

    public static void main(String[] args) {

        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(5);

        root.left.left = new Node(7);
        root.left.right = new Node(1);

        root.right.right = new Node(6);

        System.out.println("Sum of Longest Path: " + solve(root));
    }
}

