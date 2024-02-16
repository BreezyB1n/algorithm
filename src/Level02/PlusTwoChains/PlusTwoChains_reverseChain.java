package Level02.PlusTwoChains;

public class PlusTwoChains_reverseChain {
    public static void main(String[] args) {

    }

    public ListNode addInlist(ListNode head1, ListNode head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int carry = 0;
        while (head1 != null || head2 != null) {
            int val = carry;
            if (head1 != null) {
                val += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                val += head2.val;
                head2 = head2.next;
            }

            cur.next = new ListNode(val % 10);
            carry = val / 10;
            cur = cur.next;

            if (carry > 0) {
                cur.next = new ListNode(carry);
            }
        }
        return reverse(head.next);
    }


    public static ListNode reverse(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = dummyNode.next;
            dummyNode.next = cur;
            cur = next;
        }
        return dummyNode.next;
    }
}
