package Level01.HomeWork01.first_Q4;

public class MergeInBetween {
    public static void main(String[] args) {

    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int sum = 0;
        ListNode nodeA = list1, nodeB = list1, list2Node = list2;
        while (nodeA != null && sum < a - 1) {
            nodeA = nodeA.next;
        }
        sum = 0;
        while (nodeB != null && sum <= b) {
            nodeB = nodeB.next;
        }

        while (list2Node.next != null) {
            list2Node = list2Node.next;
        }
        nodeA.next = list2;
        list2Node.next = nodeB;
        return list1;
    }
}
