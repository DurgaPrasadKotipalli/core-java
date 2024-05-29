package com.ds.bt.sorting;

//BST - Any element which is lesser than root node will go towards left side
//Any element which is greater than root node will go towards right side the
public class BinarySearchTree {
    final static public void main(String args[])
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(60);
        bst.add(10);
        bst.add(90);
        bst.inorderTraversal(bst.root);

    }
    class Node
    {
        Object data;
        Node left;
        Node right;
        Node(Object data){
            this.data = data;
        }
    }
     public Node root = null;
    public void add(Object obj){
        Node newNode = new Node(obj);
        Integer givenNode = (Integer)obj;
        if(root == null)
        {
            root = newNode;
        }else{
            Node current = root;
            while(true)
            {
                Integer rootData = (Integer)current.data;
                if(givenNode.intValue()<rootData.intValue()){
                     if(current.left != null){
                         current = current.left;
                     }else{
                         current.left = newNode;
                         return;
                     }
                }else{
                    if(current.right != null){
                        current = current.right;
                    }else{
                        current.right = newNode;
                        return;
                    }
                }
            }//while

        }
    }

    //inorder() will perform inorder traversal on binary search tree
    public void inorderTraversal(Node node) {

        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }
    }
}
