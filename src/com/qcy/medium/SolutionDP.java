package com.qcy.medium;

/**
 * ���Ʊ�������
 * 
 * @author CodeHunter_qcy
 *
 */
public class SolutionDP {
	public int maxProfit(int[] prices) {
		int cost = Integer.MAX_VALUE;
		int profit = 0;
		for (int p : prices) {
			cost = Math.min(cost, p);
			profit = Math.max(profit, p - cost);
		}
		return profit;

	}
}
