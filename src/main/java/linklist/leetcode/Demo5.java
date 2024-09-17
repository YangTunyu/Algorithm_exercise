package linklist.leetcode;

public class Demo5 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            }else prev = cur;
            cur = cur.next;
        }
        return dummy.next;

    }
}
