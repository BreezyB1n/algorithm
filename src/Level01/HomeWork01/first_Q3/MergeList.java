package Level01.HomeWork01.first_Q3;

public class MergeList {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoList_improved(ListNode list1, ListNode list2) {
        //虚拟节点
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                preHead.next = list1;
                list1 = list1.next;
            } else {
                preHead.next = list2;
                list2 = list2.next;
            }
            preHead = preHead.next;
        }
        // 将多余的链表接在list1 后面
        preHead.next = list1 == null ? list2 : list1;
        return prev.next;
    }

    public static ListNode mergeTwoList(ListNode list1, ListNode list2) {
        //虚拟节点
        ListNode newHead = new ListNode(-1);
        ListNode res = newHead;
        while (list1 != null || list2 != null) {
            if (list1.val < list2.val) {
                newHead.next = list1;
                list1 = list1.next;
            } else if (list2.val < list1.val) {
                newHead.next = list2;
                list2 = list2.next;
            } else {
                newHead.next = list1;
                list1 = list1.next;
                newHead = newHead.next;
                newHead.next = list2;
                list2 = list2.next;
            }
            newHead = newHead.next;
        }

        // 下列两个while最多会有一个被执行
        while (list1 != null) {
            newHead.next = list1;
            list1 = list1.next;
            newHead = newHead.next;
        }

        while (list2 != null) {
            newHead.next = list2;
            list2 = list2.next;
            newHead = newHead.next;
        }

        return res.next;
    }

}

