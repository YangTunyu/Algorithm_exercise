package linklist.leetcode;

public class Demo8 {
    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dumpy=new ListNode(0);
        ListNode head=dumpy;
        ListNode a=list1;
        ListNode b=list2;
        while (a!=null && b!=null) {
            if(a.val<b.val) {
                head.next=a;
                a=a.next;
            }else {
                head.next=b;
                b=b.next;
            }
            head=head.next;
        }
        if(a!=null) head.next=a;
        else head.next=b;

        return dumpy.next;

    }
}
