package com.qcy.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 4.15��Ѷ������д��α��������� ��Ŀ���ѣ����ǲ����ñ����� ˼·��
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution {

	public static void main(String[] args) {

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int count = queue.size();
			while (count > 0) {
				TreeNode node = queue.poll();
				list.add(node.val);

				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				count--;

			}
			res.add(list);
		}

		return res;
	}
}

/**
 * ���ǵݹ�汾 class Solution { List<List<Integer>> res = new
 * ArrayList<List<Integer>>(); public List<List<Integer>> levelOrder(TreeNode
 * root) { if (root == null) { return new ArrayList<>(); } rec(root,0); return
 * res; } public void rec(TreeNode node,int level){ if(res.size()==level){
 * res.add(new ArrayList<>()); } res.get(level).add(node.val);
 * if(node.left!=null){ rec(node.left,level+1); } if(node.right!=null){
 * rec(node.right,level+1); } }
 * 
 * }
 * 
 * @author CodeHunter_qcy
 *
 */

class TreeNode {
	TreeNode right;
	TreeNode left;
	int val;

	public TreeNode(int val) {
		this.val = val;
	}
}
