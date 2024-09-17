package linklist.leetcode;

public class Demo7 {
    public boolean isPalindrome(ListNode head) {
        ListNode dead=reverseList(head);
        return head.val == dead.val;


    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            cur = next;
        }
        return dummy.next;
    }
}
