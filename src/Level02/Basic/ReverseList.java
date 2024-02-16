package Level02.Basic;

public class ReverseList {
    public static void main(String[] args) {

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

