package com.ds.bt.tree;

public class BinarySearchTree {
    Node root = null;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(20);
        bst.add(20);
        bst.add(30);
        bst.add(5);

        System.out.println(bst.minValue(bst.root));
        System.out.println(bst.maxValue(bst.root));
        bst.inOrder(bst.root);


    }


    public void add(Object object) {
        Node n = new Node(object);
        Integer given_data = (Integer) object;
        if (root == null) {
            root = n;
        } else {
            Node temp = root;
            while (true) {
                Integer rootData = (Integer)temp.data;
                if (given_data.intValue() < rootData.intValue()) {
                    if (temp.left != null) {
                        temp = temp.left;
                    } else {
                        temp.left = n;
                        return;
                    }
                } else {
                    if (temp.right != null) {
                        temp = temp.right;
                    } else {
                        temp.right = n;
                        return;
                    }
                }
            }
        }

    }

    public void inOrder(Node root) {
        if(root!=null) {
            inOrder(root.left);
            //Integer i1=(Integer)root.data;
            //i=i+(Integer)root.data;
            //System.out.print(i);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public Object minValue(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    public Object maxValue(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

    class Node {
        Object data;
        Node left;
        Node right;

        Node(Object data) {
            this.data = data;
        }
    }
}
