package linklist.leetcode;

public class ListNode {

    int val;
    public linklist.leetcode.ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, linklist.leetcode.ListNode next) {
        this.val = val;
        this.next = next;
    }
}
