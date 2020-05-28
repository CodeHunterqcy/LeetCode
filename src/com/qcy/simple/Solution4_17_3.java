package com.qcy.simple;

import java.util.HashMap;
import java.util.Map;

public class Solution4_17_3 {
	Map<Integer, Integer> map;
	int[] preorder;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int preLen = preorder.length;
		int inLen = inorder.length;
		if (preLen != inLen) {
			return null;
		}
		this.preorder = preorder;
		map = new HashMap<Integer, Integer>(inLen);
		for (int i = 0; i < inLen; i++) {
			map.put(inorder[i], i);
		}
		return rec(0, preLen - 1, 0, inLen - 1);
	}

	private TreeNode rec(int preL, int preR, int inL, int inR) {
		if (preL > preR || inL > inR) {
			return null;
		}
		int pivot = preorder[preL];
		int pivotIndex = map.get(pivot);
		TreeNode root = new TreeNode(pivot);
		root.left = rec(preL + 1, preL + pivotIndex - inL, inL, pivotIndex - 1);
		root.right = rec(preL + pivotIndex - inL + 1, preR, pivotIndex + 1, inR);
		return root;
	}

}

class TreeNode {
	int val;
	TreeNode right;
	TreeNode left;

	public TreeNode(int x) {
		val = x;

	}

}