package HashAndQueue;



public class LinkQueue {
    private Node front;
    private Node rear;
    private int size;

    public LinkQueue() {
        this.front = new Node(0);
        this.rear = new Node(0);
    }

    /**
     * 入队
     */
    public void push(int value) {
        Node newNode = new Node(value);
        Node temp = front;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        rear = newNode;
        size++;
    }

    /**
     * 出队
     */
    public int pull() {
        if (front.next == null) {
            System.out.println("Queue is empty now");
        }
        Node firstNode = front.next;
        front.next = firstNode.next;
        size--;
        return firstNode.val;
    }

    /**
     * 遍历队列
     */

    public void traverse() {
        Node temp = front.next;
        while (temp != null) {
            System.out.print(temp.val + "\n");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.push(1);
        linkQueue.push(2);
        linkQueue.push(3);
        System.out.println("第一个出队列元素：" + linkQueue.pull());
        System.out.println("队列中的元素：");
        linkQueue.traverse();
    }

}
