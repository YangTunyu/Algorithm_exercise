package digui.leetcode;

public class JieChen {
    public static int multiply(int num) {
        if(num == 1){
            return 1;
        }
        return num * multiply(num - 1);
    }
}
