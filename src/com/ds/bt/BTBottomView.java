package com.ds.bt;

import java.util.*;

public class BTBottomView {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		bottamView(root);

	}

	public static void bottamView(Node root) {
		Map<Integer, NodeLevel<Integer, Integer>> map = new TreeMap<>();
		bottamView(root, 0, 0, map);
		for (NodeLevel<Integer, Integer> it : map.values()) {
			System.out.print(it.value + " ");
		}
	}

	public static void bottamView(Node root, int d, int level, Map<Integer, NodeLevel<Integer, Integer>> map) {
		if (root == null) {
			return;
		}
		//if (!map.containsKey(d) || level >= map.get(d).level) {
			map.put(d, NodeLevel.of(root.data, level));
		//}
		bottamView(root.left, d - 1, level + 1, map);
		bottamView(root.right, d + 1, level + 1, map);
	}

}

class NodeLevel<U, V> {
	public final U value;  //data
	public final V level; //level of BT
    

	private NodeLevel(U value, V level) {
		this.value = value;
		this.level = level;
	} 
	

	public static <U, V> NodeLevel<U, V> of(U value, V level) {

		return new NodeLevel<>(value, level);
	}
}




