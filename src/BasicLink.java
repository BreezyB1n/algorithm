
public class BasicLink extends BasicLinkList{
    public static void main(String[] args) {

    }

    /**
     * 链表插入
     * @param head  链表头节点
     * @param nodeInsert 待插入节点
     * @param position 待插入位置，从1开始
     * @return 插入后得到的链表头节点
     */
    public static Node insertNode(Node head, Node nodeInsert, int position) {
        //查看头节点
        if (head == null) {
            //这里可以认为待插入的节点就是链表的头节点，也可以抛出不能插入的异常
            return nodeInsert;
        }
        //获取存放的元素个数
        //查看是否越界
        int size = getLength(head);
        if (position > size + 1 || position < 1) {
            System.out.println("out range of list");
            return head;
        }

        //表头插入
        if (position == 1) {
            nodeInsert.next = head;
            head = nodeInsert;
            return head;
        }

        Node pNode = head;
        int count = 1;
        // 这里position已经被上面size限制住，不用考虑pNode == null
        while (count < position - 1) {
            // 找到插入位置前一个节点的位置
            pNode = pNode.next;
            count++;
        }
        nodeInsert.next = pNode.next;
        pNode.next = nodeInsert;

        return head;
    }
}

class Node {
    //定义链表
    public int val;
    public Node next;

    Node (int x) {
        val = x;
        next = null;
    }
}
