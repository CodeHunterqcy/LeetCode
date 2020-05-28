package com.qcy.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ���ϵ��´�ӡ������ Ҳ���ǲ�α�����������ֻ��������Ҫ���ղ�δ�ӡ
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution5_4 {
	public int[] levelOrder(TreeNode root) {
		if (root == null) {
			return new int[0];
		}
		List<Integer> res = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			res.add(node.val);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		res.stream().mapToInt(Integer::intValue).toArray();
		return res.stream().mapToInt(Integer::intValue).toArray();// ��ס���
	}
}
