package com.ds.bt;

import java.util.Map;
import java.util.TreeMap;

public class BT2BottomView {

	public static void main(String[] args) {
		Node root = new Node(13);
		root.left = new Node(10);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.left.right.left = new Node(11);
		
		root.right = new Node(18);
		root.right.right = new Node(20);
		root.right.right.left = new Node(22);

		bottamView(root);

	}
	
	
	public static void bottamView(Node root) {
		Map<Integer, NodeLevel2> map = new TreeMap<>();
		bottamView(root, 0, 0, map);
		for (NodeLevel2 it : map.values()) {
			System.out.print(it.value + " ");
		}
	}

	public static void bottamView(Node root, int d, int level, Map<Integer, NodeLevel2> map) {
		if (root == null) {
			return;
		}
		if (!map.containsKey(d) || level >= map.get(d).level) {
			map.put(d, NodeLevel2.of(root.data, level));
		}
		bottamView(root.left, d - 1, level + 1, map);
		bottamView(root.right, d + 1, level + 1, map);
	}

}


class NodeLevel2 {
	public final int value;  //data
	public final int level; //level of BT
    

	private NodeLevel2(int value, int level) {
		this.value = value;
		this.level = level;
	} 
	

	public static NodeLevel2 of(int value, int level) {

		return new NodeLevel2(value, level);
	}
}
