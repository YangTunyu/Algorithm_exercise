package linklist.leetcode;

public class Demo2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        while (p.next != null) {
            if (p.next.val == p.val) {
                p.next = p.next.next;
            }else p = p.next;
        }
        return head;

    }
}
