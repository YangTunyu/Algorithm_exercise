package DynamicProgramming.leetcode;

public class Demo6 {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
        System.out.println(demo6.fib(10));
    }
}
