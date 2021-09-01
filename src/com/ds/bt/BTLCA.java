package com.ds.bt;

import java.util.ArrayList;
import java.util.List;

public class BTLCA {
	
	Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

	public static void main(String[] args) {
		BTLCA tree = new BTLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		//tree.root.left.left.left = new Node(10);
		//tree.root.left.right.right = new Node(14);

		System.out.println("LCA(4, 5): " + tree.findLCA(4, 5));

	}
	
	public int findLCA(int n1, int n2) {
		return findLCAInternal(root, n1, n2);
	}
	
	private int findLCAInternal(Node root, int n1, int n2) {
		if (!findPath(root, n1, path1) || !findPath(root, n2, path2) ) {
			System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
			System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
			return -1;
		}
		
		System.out.println(path1);
		System.out.println(path2);

		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {

			System.out.println(path1.get(i) + " " + path2.get(i));
			if (!path1.get(i).equals(path2.get(i)))
				break;
		}

		return path1.get(i - 1);

	}

	private boolean findPath(Node root, int n, List<Integer> path) {
		
		System.out.println("begin ::::::::::::: Node :: "+root.data+ ", item :: "+n);
		// base case
		if (root == null) {
			return false;
		}

		// Store this node . The node will be removed if
		// not in path from root to n.
		path.add(root.data);

		if (root.data == n) {
			System.out.println("data is "+root.data);
			return true;
		}

		if (root.left != null && findPath(root.left, n, path)) {
			return true;
		}

		if (root.right != null && findPath(root.right, n, path)) {
			return true;
		}
		
		
		System.out.println("not present in the subtree "+path);
		

		// If not present in subtree rooted with root, remove root from
		// path[] and return false
		path.remove(path.size() - 1);

		return false;
	}

}
