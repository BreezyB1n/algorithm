package Level01.HomeWork01.first_Q1;

import java.util.Stack;

public class same_point_stack {
    public static void main(String[] args) {

    }

    public Node findCommonNodeByStack(Node headA, Node headB) {
        Stack<Node> stackA = new Stack<>();
        Stack<Node> stackB = new Stack<>();
        while (headA != null) {
            //push node into stack
            stackA.push(headA);
            headA = headA.next;
        }

        while (headB != null) {
            //push node into stack
            stackB.push(headB);
            headB = headB.next;
        }

        Node preNode = null;
        while (stackA.size() > 0 && stackB.size() > 0) {
            if (stackA.peek() == stackB.peek()) {
                //preNode get the node position
                preNode = stackA.pop();
                stackB.pop();
            } else {
                // when there is no common node, which symbols we find the first common point
                break;
            }
        }
        return preNode;
    }
}

class Node {
    public int val;
    public Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}
