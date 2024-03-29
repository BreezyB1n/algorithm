package Level04_Stack;

public class Stack_basedLinkedList {
    public static void main(String[] args) {
        //测试
        MyStack<String> stack = new MyStack<>();

        System.out.println(stack.isEmpty());
        stack.push("java");
        stack.push("is");
        stack.push("beautiful");
        stack.push("language");
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}

class ListStack<T> {
    //定义链表
    class Node<T> {
        public T t;
        public Node next;
    }

    public Node<T> head;
    //构造函数初始化头指针
    ListStack() {
        head = null;
    }

    //入栈
    public void push(T t) {
        if (t == null) {
            throw new NullPointerException("参数不能为空");
        }
        if (head == null) {
            head = new Node<T>();
            head.t = t;
            head.next = null;
        } else {
            Node<T> temp = head;
            head = new Node<T>();
            head.t = t;
            head.next = temp;
        }
    }

    //出栈
    public T pop() {
        if (head == null) {
            return null;
        }
        T t = head.t;
        head = head.next;
        return t;
    }

    //取栈顶元素
    public T peek() {
        if (head == null) {
            return null;
        }
        T t = head.t;
        return t;
    }

    //栈空
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else
            return false;
    }
}
