package Level02.ReverseRange;

import java.util.List;

public class seconde_method {
    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;

        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        ListNode leftNode = pre.next;
        ListNode succ = rightNode.next;
        //这一一定要让 rightNode.next = null;
        rightNode.next = null;

        reverseList(leftNode);

        pre.next = rightNode;
        leftNode.next = succ;
        return dummyNode.next;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;

        }
        return dummyNode.next;
    }
}
