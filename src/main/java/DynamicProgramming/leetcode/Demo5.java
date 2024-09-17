package DynamicProgramming.leetcode;

public class Demo5 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length()-1;
    }
    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        System.out.println(demo5.isSubsequence("abc", "cba"));
    }
}
