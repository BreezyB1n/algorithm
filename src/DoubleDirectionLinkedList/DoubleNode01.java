package DoubleDirectionLinkedList;

public class DoubleNode01 {
    public static void main(String[] args) {

    }
}

class DoubleNode {
    public int data;//数据域
    public DoubleNode prev;
    public DoubleNode next;

    public DoubleNode(int data) {
        this.data = data;
    }

    public void showNode() {
        System.out.println("Node data is :" + data);
    }
}
