package binarytree.leetcode;


import java.util.ArrayList;
import java.util.List;


public class Demo1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<Integer>(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}
