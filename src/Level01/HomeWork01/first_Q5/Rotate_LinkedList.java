package Level01.HomeWork01.first_Q5;

public class Rotate_LinkedList {
    public static void main(String[] args) {

    }

    public static ListNode rotateList(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        // 将三个变量都指向链表头节点
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;

        while (temp != null) {
            head = head.next;
            len++;
        }
        if ((k % len) == 0) {
            return temp;
        }
        //这里开始fast从头节点往后走
        //这里进行取模，防止k > len
        //例如len = 5，这样k = 2和7效果是一样的
        while ((k % len) > 0) {
            k--;
            fast = fast.next;
        }
        //快指针走了k步，此时快慢指针一起前进
        //当fast到达尾节点时，slow正好在第k个位置上
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = temp;
        return res;
    }
}
