package com.qcy.medium;

import java.util.ArrayList;
import java.util.List;

public class AllString {
	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
	System.out.println(String.valueOf(ch));	
	}
	List<String> res = new ArrayList<String>();
	char[] c;
	
	private void dfs(int depth) {
		// TODO Auto-generated method stub
		if(depth==c.length-1) {
			res.add(String.valueOf(c));
		}
	}
}
