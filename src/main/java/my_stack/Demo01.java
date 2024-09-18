package my_stack;

import java.util.Objects;
import java.util.Stack;

public class Demo01 {

        //有效括号
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            // 如果长度是奇数，直接返回 false
            if (s.length() % 2 != 0) return false;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // 处理左括号
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                // 处理右括号
                else if (c == ')' || c == '}' || c == ']') {
                    // 检查栈是否为空
                    if (stack.isEmpty()) {
                        return false;
                    }
                    // 检查括号是否匹配
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            // 如果栈为空，说明所有括号都匹配
            return stack.isEmpty();
        }
//    //简单方法
//    public boolean isValid(String s) {
//        int length = s.length() / 2;
//        for (int i = 0; i < length; i++) {
//            s = s.replace("()", "").replace("{}", "").replace("[]", "");
//        }
//
//        return s.isEmpty();
//    }

}
