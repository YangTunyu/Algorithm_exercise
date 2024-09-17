package DynamicProgramming.leetcode;

public class Demo10 {
    //181错解
    public String reverseMessage(String message) {
        String[] words = message.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            if(i==0){
                sb.append(words[i]);
            }else sb.append(words[i]).append(' ');
        }
        return sb.toString();


    }
}
