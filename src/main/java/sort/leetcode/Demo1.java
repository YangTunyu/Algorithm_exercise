package sort.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        return set.stream().mapToInt(i -> i).toArray();
    }
}
