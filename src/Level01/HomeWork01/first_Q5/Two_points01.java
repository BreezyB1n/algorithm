package Level01.HomeWork01.first_Q5;

public class Two_points01 {
    public static void main(String[] args) {

    }

    public ListNode getKthFormEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
