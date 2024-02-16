package Level01.HomeWork01.first_Q3;

public class MergeKList {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (ListNode node : lists) {
            // 先两两合并
            res = mergeTwoList_improved(res, node);
        }
        return res;
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
}
