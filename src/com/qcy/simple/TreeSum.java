package com.qcy.simple;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树路径和为某一值的路径
 * 
 * @author CodeHunter_qcy
 *
 */
public class TreeSum {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int x) {
			val = x;
		}
	}

	LinkedList<List<Integer>> res = new LinkedList<>();
	LinkedList<Integer> path = new LinkedList<>();

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		rec(root, sum);
		return res;
	}

	public void rec(TreeNode root, int target) {
		if (root == null) {
			return;
		}
		path.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			res.add(new LinkedList<>(path));
		}
		rec(root.left, target);
		rec(root.right, target);
		path.removeLast();
	}

}
