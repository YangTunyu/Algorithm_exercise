package binarytree.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;

    }
}
