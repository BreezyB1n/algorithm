package Level01.GoldenChangle;

public class GlodenChangle {
    public static void main(String[] args) {

    }

    //使用双指针的方法判断是否有环
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
