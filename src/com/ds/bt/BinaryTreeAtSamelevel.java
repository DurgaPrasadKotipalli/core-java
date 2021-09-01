package com.ds.bt;

class Node
{
    int data;
    Node left = null, right = null, next = null;

    Node(int data) {
        this.data = data;
    }

	public Node() {
	}
}
public class BinaryTreeAtSamelevel
{
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
    
    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + "->");
        if (root.next != null) {
            System.out.println(root.next.data);
        } else {
            System.out.println("null");
        }
        inorder(root.right);
    }
    public static Node findNextNode(Node root)
    {
        
        if (root == null || root.next == null) {
            return null;
        }
        
        if (root.next.left != null) {
            return root.next.left;
        }
        if (root.next.right != null) {
            return root.next.right;
        }
        return findNextNode(root.next);
    }
    
    public static void linkNodes(Node root)
    {
        if (root == null) {
            return;
        }
        linkNodes(root.next);
        if (root.left != null) {
            root.left.next = (root.right != null)? root.right: findNextNode(root);
        }
        if (root.right != null) {
            root.right.next = findNextNode(root);
        }
        linkNodes(root.left);
        linkNodes(root.right);
    }

    public static void main(String[] args)
    {

        Node root = new Node();
        root.left = new Node();
        root.right = new Node();
        root.left.left = new Node();
        root.left.right = new Node();
        root.right.right = new Node();
        root.left.left.right = new Node();
        root.right.right.left = new Node();
        linkNodes(root);
        Node node = root;
        while (node != null)
        {
            
            printList(node);
            if (node.left != null)
                node = node.left;
            else if (node.right != null)
                node = node.right;
            else
                node = findNextNode(node);
        }

        
    }
}

