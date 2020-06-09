package com.qcy.hard;

import java.util.ArrayList;
import java.util.List;

/*并查集*/
public class BinChaji {
	public boolean equationsPossible(String[] equations) {
		PigOneEgg rolex = new PigOneEgg(26);
		List<int[]> list = new ArrayList<>();
		for (String s : equations) {
			char x = s.charAt(0);
			char y = s.charAt(3);
			if (s.charAt(1) == '=') {
				rolex.union(x - 'a', y - 'a');
			} else {
				list.add(new int[] { x - 'a', y - 'a' });
			}
		}
		for (int[] arr : list) {
			if (rolex.find(arr[0]) == rolex.find(arr[1])) {
				return false;
			}
		}
		return true;
	}

//并查集模板
	class PigOneEgg {
		int[] parent;

		public PigOneEgg(int len) {
			parent = new int[len];
			for (int i = 0; i < len; i++) {
				parent[i] = i;
			}
		}

		public int find(int x) {
			return x == parent[x] ? x : (parent[x] = find(parent[x]));
		}

		public void union(int x, int y) {
			parent[find(x)] = find(y);
		}
	}
}
