package DynamicProgramming.leetcode;

public class Demo8 {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb=new StringBuilder(word);
        int count=0;
        while (sequence.contains(sb.toString())) {
            count++;
            sb.append(word);
        }
        return count;
    }
}
