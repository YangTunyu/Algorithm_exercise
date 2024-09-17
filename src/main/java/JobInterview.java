//面试考过，都是泪

public class JobInterview {

    //有效括号
    public boolean isValid(String s) {
        int n = s.length() / 2;
        for (int i = 0; i < n; i++) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.isEmpty();
    }

    //无重复字符最长子串
    public int lengthOfLongestSubstring(String s) {
        int[] ck = new int[128];
        int res = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            ck[s.charAt(j)]++;
            while (ck[s.charAt(j)] > 1) {
                ck[s.charAt(i++)]--;
            }
            res = Math.max(res, j - i + 1);

        }
        return res;

    }

    //541 反转字符串
    public String reverseStr(String s, int k) {
        char[] sc = s.toCharArray();
        int i = 0, j = k;
        while (j < s.length()) {
            reverse(sc, i, j - 1);

            if (sc.length < 2 * k) {
                reverse(sc, k, sc.length - 1);
            }

        }


        return new String(sc);

    }

    //28. 找出字符串中第一个匹配项的下标
    public static void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
