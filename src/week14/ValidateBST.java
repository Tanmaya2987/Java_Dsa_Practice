package week14;


public class ValidateBST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isValidBST(Node root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean validate(Node root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return validate(root.left, min, root.data)
            && validate(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(8);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(7);
        root.right.right = new Node(9);

        System.out.println("Valid BST: " + isValidBST(root));
    }
}

