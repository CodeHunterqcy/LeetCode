package com.qcy.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 深度优先搜索
 * 
 * 岛屿数量问题
 * 
 * @author CodeHunter_qcy
 *
 */
public class SolutionDFS {
	/*
	 * //深度搜索 public int numIslands(char[][] grid) { if (grid == null || grid.length
	 * == 0) { return 0; } int res = 0; for (int i = 0; i < grid.length; i++) { for
	 * (int j = 0; j < grid[0].length; j++) { if (grid[i][j] == '1') { res++;
	 * dfs(grid, i, j); } } } return res; }
	 * 
	 * private void dfs(char[][] grid, int i, int j) { if (i < 0 || j < 0 || i >=
	 * grid.length || j >= grid[0].length || grid[i][j] == '0') { return; }
	 * grid[i][j]='0'; dfs(grid, i+1, j); dfs(grid, i-1, j); dfs(grid, i, j+1);
	 * dfs(grid, i, j-1); }
	 */

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		int l = grid.length;
		int w = grid[0].length;
		int res = 0;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < w; j++) {
				if (grid[i][j] == '1') {
					++res;
					grid[i][j] = '0';
					Queue<Integer> queue = new LinkedList<Integer>();
					queue.add(i * w + j);
					while (!queue.isEmpty()) {
						int n = queue.remove();
						int row = n / w;
						int col = n % w;

						if (row - 1 >= 0 && grid[row - 1][col] == '1') {
							queue.add((row - 1) * w + col);
							grid[row - 1][col] = '0';
						}
						if (row + 1 < l && grid[row + 1][col] == '1') {
							queue.add((row + 1) * w + col);
							grid[row + 1][col] = '0';
						}
						if (col - 1 >= 0 && grid[row][col - 1] == '1') {
							queue.add(row * w + col - 1);
							grid[row][col - 1] = '0';
						}
						if (col + 1 < w && grid[row][col + 1] == '1') {
							queue.add(row * w + col + 1);
							grid[row][col + 1] = '0';
						}

					}
				}
			}
		}

		return res;
	}

}
