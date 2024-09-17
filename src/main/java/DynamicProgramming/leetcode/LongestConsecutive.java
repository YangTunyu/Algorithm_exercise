package DynamicProgramming.leetcode;

import java.util.Arrays;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)return 0;
        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(uniqueNums);
        int longest = 1;
        int temp = 1;
        for (int i = 0; i < uniqueNums.length - 1; i++) {
            if (uniqueNums[i]+1 == uniqueNums[i + 1]) {
                temp++;
                longest = Math.max(longest, temp);
            }else temp = 1;
        }
        return longest;

    }
}
