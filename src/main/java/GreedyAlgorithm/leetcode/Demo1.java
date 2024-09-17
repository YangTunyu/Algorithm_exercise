package GreedyAlgorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int longest = 0;
        int tem = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if ((entry.getValue()%2 == 1 &&entry.getValue()!=1)|| (entry.getValue()%2 == 0 &&entry.getValue()!=0)){
                int temp = entry.getValue()/2;
                longest +=2*temp;
            }
            if(entry.getValue() == 1||entry.getValue()%2 == 1){
                tem = 1;
            }
        }
        return longest+tem;
    }
}
