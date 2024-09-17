package DynamicProgramming.leetcode;

public class Demo3 {
    public int maxProfit(int[] prices) {
        int i = 0,j=1;
        int profit = 0;
        while (i <= j&&j<=prices.length-1) {
            if (prices[i] < prices[j]) {
                profit = Math.max(profit, prices[j]-prices[i]);
            }else i=j;
            j++;
        }
        return profit;
    }
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        System.out.println(demo3.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
