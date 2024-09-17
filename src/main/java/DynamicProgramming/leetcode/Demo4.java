package DynamicProgramming.leetcode;

import java.util.Arrays;

public class Demo4 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        if(n==0){
            return res;
        }
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <=n; i++) {
            res[i] = res[i / 2] + res[i % 2];
        }
        return res;
    }
    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        int[] res = demo4.countBits(3);
        System.out.println(Arrays.toString(res));
    }

}
