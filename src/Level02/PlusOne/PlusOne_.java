package Level02.PlusOne;

import java.util.Stack;

public class PlusOne_ {
    public static void main(String[] args) {

    }

    public ListNode plusOne(ListNode head) {
        Stack<Integer> listNodes = new Stack<>();
        // push value into stack
        while (head != null) {
            listNodes.push(head.val);
            head = head.next;
        }
        int carry = 0;
        int adder = 1;
        ListNode dummyNode = new ListNode(-1);

        while (!listNodes.isEmpty() || carry > 0) {
            int digit = listNodes.isEmpty() ? 0 : listNodes.pop();
            int sum = digit + adder + carry;
            carry = sum >= 10 ? 1 : 0;
            sum = sum >= 10 ? sum - 10 : sum;
            ListNode cur = new ListNode(sum);
            cur.next = dummyNode.next;
            dummyNode.next = cur;
            adder = 0;
        }
        return dummyNode.next;
    }
}
