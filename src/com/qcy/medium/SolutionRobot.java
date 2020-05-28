package com.qcy.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionRobot {
	private int[][] num;
	private int l, w;
	List<List<Integer>> res = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		int[][] g = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		new SolutionRobot().pathWithObstacles(g);

	}

	public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
		num = obstacleGrid;
		l = num.length;
		w = num[0].length;
		dfs(0, 0, new boolean[l][w]);
		return res;
	}

	private boolean dfs(int i, int j, boolean[][] visited) {
		// TODO Auto-generated method stub
		if (i >= l || j >= w || visited[i][j] || num[i][j] == 1) {
			return false;
		}
		res.add(Arrays.asList(i, j));
		System.out.println(i + "  " + j);
		if (i == l - 1 && j == w - 1) {
			return true;
		}
		visited[i][j] = true;
		if (dfs(i + 1, j, visited) || dfs(i, j + 1, visited)) {
			return true;
		}
		res.remove(res.size() - 1);
		return false;
	}
}
