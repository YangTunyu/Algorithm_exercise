package arr;

public class Kmp {
    public int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        if (need.length == 0) {
            return 0; // 如果 needle 是空串，按照 indexOf 的惯例应该返回 0
        }

        for (int i = 0; i <= hay.length - need.length; i++) {
            if (hay[i] == need[0]) { // 找到 needle 的第一个字符匹配的位置
                boolean found = true;
                for (int j = 1; j < need.length; j++) {
                    if (hay[i + j] != need[j]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i; // 返回匹配的起始位置
                }
            }
        }

        return -1; // 未找到匹配的子串


    }
}
