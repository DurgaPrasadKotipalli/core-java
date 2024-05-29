package com.ds.bt.tree;

import java.util.LinkedList;
import java.util.List;

public class TreeImpl {

    static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {

        TreeImpl tree = new TreeImpl();
        tree.root= new Node(15);
        tree.root.left = new Node(13);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(14);
        tree.root.left.right.left = new Node(12);
        tree.root.right.left = new Node(17);
        tree.root.right.right = new Node(22);
        System.out.println(tree.root);
        tree.inOrder(tree.root);
        if(tree.checkBST(list)){
            System.out.println("The given tree is binary search tree");
            int minimumDistance = tree.minDistance(list);
            System.out.println("The minimum distance between nodes is "+minimumDistance);
        }
        else{
            System.out.println("the given tree is not binary search tree");
        }

        printView();
        int depth = depth(root, 12, 0);
        System.out.println("depth of a tree is :: "+depth);
    }

    public boolean checkBST(LinkedList<Integer> list){
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }


    public int minDistance(LinkedList<Integer> list){
        int min = list.get(1) - list.get(0);
        for(int i=1; i<list.size()-1; i++){
            if(min > (list.get(i+1) - list.get(i))){
                min = list.get(i+1) -list.get(i);
            }
        }
        return min;
    }

    static Node root = null;
    static class Node{
        Object data;
        Node left;
        Node right;
        Node(Object data){
            this.data = data;
        }
    }

    public void inOrder(Node root) {
        if(root!=null) {
            inOrder(root.left);
            //Integer i1=(Integer)root.data;
            //i=i+(Integer)root.data;
            //System.out.print(i);
            System.out.print(root.data+" ");
            list.add((Integer)root.data);
            inOrder(root.right);
        }
    }
    public static void printView(){
        List<Integer> list = new LinkedList<>();
        printRightView(root, 1, list);
        System.out.println(list);
    }


    public static void printLeftView(Node root, int level, List<Integer> leftViewList)
    {
        if(root == null){
            return;
        }else{
            if(leftViewList.size() < level){
                leftViewList.add((Integer)root.data);
            }
            printLeftView(root.left, level+1, leftViewList);
            printLeftView(root.right, level+1, leftViewList);
        }
    }

    public static void printRightView(Node root, int level, List<Integer> rightViewList)
    {
        if(root == null){
            return;
        }else{
            if(rightViewList.size() < level){
                rightViewList.add((Integer)root.data);
            }
            printRightView(root.right, level+1, rightViewList);
            printRightView(root.left, level+1, rightViewList);
        }
    }

    public static int depth(Node root, int target, int level){
        if(root == null){
            return -1;
        }
        else if((Integer)root.data == target){
            return level;
        }else{
            int leftHeight = depth(root.left, target, level+1);
            int rightHeight = depth(root.right, target, level+1);
            if(leftHeight == -1){
               return rightHeight;
            }else{
                return leftHeight;
            }
        }


    }
}
