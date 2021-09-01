package com.hacker.test;

public class BinarySearchTree {
	
    Node root;
	
	BinarySearchTree(){
		root = null;
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		
		bst.kthLargest(3);
	}
	
	
    
	//function to insert nodes
	public void insert(int data) {
		this.root = insertRec(this.root, data);
	}
	
	//utility function to insert node with given key in BST
	Node insertRec(Node node, int data) {
		
		if(node == null) {
			this.root = new Node(data);
			return this.root;
		}
		
		if(data == node.data) {
			return node;
		}
		
		if(data < node.data) {
		   node.left = this.insertRec(node.left, data);
		}else {
			node.right = this.insertRec(node.right, data);
		}
		
		return node;
		
	}
	
	void kthLargest(int key) {
		Count c = new Count();
		this.kthLargestUtil(this.root, key, c);
	}
	
	public void kthLargestUtil(Node node, int key, Count c) {
		if( node == null || c.c >= key) {
			return;
		}
		
		this.kthLargestUtil(node.right, key, c);
		c.c++;
		if(c.c == key) {
			System.out.println(key+"th largest element is "+node.data);
			return;
		}
		
		this.kthLargestUtil(node.left, key, c);
	}
}


class Node{
	int data;
	Node left, right;
	
	Node(int data){
		this.data = data;
		left = right = null;
	}
}

class Count{
	int c =0;
}