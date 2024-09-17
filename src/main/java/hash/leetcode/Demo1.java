package hash.leetcode;

import linklist.leetcode.ListNode;

import java.util.*;

public class Demo1 {
//    public boolean isAnagram(String s, String t) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        for (char c : t.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) - 1);
//        }
//        for (int count : map.values()) {
//            if (count != 0) {
//                return false;
//            }
//        }
//
//        return true;
//
//    }
//public int[] intersection(int[] nums1, int[] nums2) {
//    Set<Integer> set = new HashSet<>();
//    int[] res = new int[nums2.length];
//    for (int i = 0; i < nums1.length; i++) {
//        set.add(nums1[i]);
//    }
//    for (int i = 0; i < nums2.length; i++) {
//        if (set.contains(nums2[i])) {
//            res[i] = nums2[i];
//        }
//    }
//    return res;
//
//}
//public int[] twoSum(int[] nums, int target) {
//    Map<Integer,Integer> ap=new HashMap<>();
//    int[] res=new int[2];
//    for(int i=0;i<nums.length;i++){
//        if(ap.containsKey(target-nums[i])){
//            res[0]=i;
//            res[1]=ap.get(target-nums[i]);
//        }
//        ap.put(nums[i],i);
//    }
//    return res;
//}
public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    if(nums[0]>0){
        return null;
    }
    List<List<Integer>> res = new ArrayList<>();

    for(int i=0;i<nums.length;i++){
        int l=i+1,r=nums.length;
        while(l<r){
            if(nums[i]+nums[l]+nums[r]>0){
                r--;
            }
            if(nums[i]+nums[l]+nums[r]<0){
                l++;
            }
            if(nums[i]+nums[l]+nums[r]==0){
             res.add(Arrays.asList(nums[i],nums[l],nums[r]));
            }

        }
    }
    return res;
}

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        }

}
