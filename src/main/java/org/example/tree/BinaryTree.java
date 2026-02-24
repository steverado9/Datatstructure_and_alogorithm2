package org.example.tree;

class Node {

    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {

    Node root;

    public void insert(int data) {

        if(root == null)
            root = new Node(data);
    }
}
