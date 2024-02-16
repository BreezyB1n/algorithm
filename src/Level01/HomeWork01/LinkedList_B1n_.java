package Level01.HomeWork01;

public class LinkedList_B1n_ {
    public static void main(String[] args) {
        Node node1 = new Node("a","java");
        Node node2 = new Node("b","java");


        Node node3 = new Node("c","CPP");
        Node node4 = new Node("d","CPP");

        Node node5 = new Node("e","python");
        Node node6 = new Node("f","pyhton");

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Node.insertNewNode(node1, new Node("asd","CPP"));
        node1.showLinkedList();
    }
}

class Node {
    public String name;
    public String language;
    public Node next;

    public Node(String name, String language) {
        this.name = name;
        this.language = language;
        next = null;
    }

    public static int getLength(Node head) {
        int i = 0;
        Node node = head;
        while (node != null) {
            node = node.next;
            i++;
        }
        return i;
    }

    //编译输出链表
    public void showLinkedList() {
        int len = getLength(this);
        Node node = this;
        while (len - 1 > 0 || node != null) {
            System.out.println(node);
            node = node.next;
            len--;
        }
    }

    public static Node insertNewNode(Node head, Node insertNode) {
        if (head == null) {
            return head;
        }

        //判断语言类型
        //插入头节点
        Node cur = head;



        while (cur.next != null) {
            if (cur.language == insertNode.language && cur.next.language != insertNode.language) {
                //记住顺序
                insertNode.next = cur.next;
                cur.next = insertNode;
                return head;
            }
            cur = cur.next;
        }
        return head;
    }

    public void deleteNode(Node node) {

    }

    @Override
    public String toString() {
        return "{" +
                "\"" + name + '\"' +
                "\"" + language + '\"' +
                '}';
    }
}
