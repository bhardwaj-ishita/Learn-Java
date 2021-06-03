package com.company;

public class BinaryTree {
    static Node root;

    public BinaryTree() {root=null;}

    static void inOrder() {inOrder(root);}
    static void preOrder() {preOrder(root);}
    static void postOrder() {postOrder(root);}

    static void levelOrder() {
        int height = height(root);
        for(int i = 1; i <= height; i++)currentLevelOrder(root, i);
    }

    static int height(Node root) {
        if(root == null) return 0;
        int leftHeight = 0, rightHeight = 0;
        leftHeight = height(root.left);
        rightHeight = height(root.right);
        if(leftHeight > rightHeight) return leftHeight + 1;
        else return rightHeight + 1;
    }

    static void currentLevelOrder(Node root, int level) {
        if(root == null) return;
        if(level == 1) {
            System.out.print(root.key + " ");
        }

        else if(level>1) {
            currentLevelOrder(root.left, level - 1);
            currentLevelOrder(root.right, level - 1);
        }
    }

    static void inOrder(Node node) {
        if(node == null) return;
        //reach all the way to the bottom left
        //print
        //as coming back up reach the right child
        //42513 ^

        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }

    static void preOrder(Node node) {
        if(node == null) return;
        //print the root
        //come down one by one to the left children
        //when reached the bottom come up and reach the right children one by one
        //12453 lambda

        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static void postOrder(Node node) {
        if(node == null) return;
        //reach the bottom left
        //reach the adjacent right child
        //and print as we go up and print the pair children

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.print("InOrder traversal: ");inOrder();
        System.out.println();
        System.out.print("PreOrder traversal: ");preOrder();
        System.out.println();
        System.out.print("PostOrder traversal: ");postOrder();
        System.out.println();
        System.out.print("LevelOrder traversal: ");levelOrder();


    }
}
