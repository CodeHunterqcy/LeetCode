package com.qcy.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 数组全排列，深度优先加回溯
 * 
 * @author CodeHunter_qcy
 *
 */
public class DFS4_25 {
	public static void main(String[] args) {

	}

	List<List<Integer>> res = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] nums) {
		int len = nums.length;
		if (nums == null || len == 0) {
			return new ArrayList<>();
		}
		boolean[] visited = new boolean[len];
		Deque<Integer> path = new ArrayDeque<>();
		dfs(nums, len, 0, path, visited);
		return res;
	}

	private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] visited) {
		// TODO Auto-generated method stub
		if (len == depth) {
			res.add(new ArrayList<Integer>(path));
			return;
		}
		for (int i = 0; i < len; i++) {
			if (visited[i]) {
				continue;
			}
			path.addLast(nums[i]);
			visited[i] = true;
			dfs(nums, len, depth + 1, path, visited);
			visited[i] = false;
			path.removeLast();
		}

	}

}
