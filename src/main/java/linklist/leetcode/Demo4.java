package linklist.leetcode;

public class Demo4 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode A=headA,B=headB;
       while(A!=B) {
          A=A!=null?A.next:headB;
          B=B!=null?B.next:headA;
       }
       return A;

    }
}
