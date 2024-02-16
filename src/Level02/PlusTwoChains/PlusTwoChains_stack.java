package Level02.PlusTwoChains;

import java.util.Stack;

public class PlusTwoChains_stack {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack();
        Stack<ListNode> stack2 = new Stack();

        while (l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }

        ListNode newHead = new ListNode(-1);
        int carry = 0;
        // 这是carry != 0，是因为两个栈都为null时，如果carry = 0，就不需要再遍历了
        while (!stack1.empty() || !stack2.empty() || carry != 0) {
            ListNode a = new ListNode(0);
            ListNode b = new ListNode(0);
            if (!stack1.empty()) {
                a = stack1.pop();
            }
            if (!stack2.empty()) {
                b = stack2.pop();
            }

            int sum = a.val + b.val + carry;
            //对累加结果取余
            int ans = sum % 10;
            // 如果大于0 进位
            carry = sum / 10;
            ListNode cur = new ListNode(ans);
            cur.next = newHead.next;
            //把每次更新得到的节点更新到newHead.next中
            newHead.next = cur;
        }
        return newHead.next;
    }
}
