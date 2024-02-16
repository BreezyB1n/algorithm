package Level01.HomeWork01.first_Q2;

import java.util.Stack;

public class PalindromeSequence {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(Node head) {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        // push nodes into stack
        while(temp != null) {
           stack.push(temp.val);
           temp = temp.next;
        }

        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
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
