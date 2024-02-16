package HashAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class OneQueue_Stack {
    public static void main(String[] args) {

    }
}

class MyStack_One {

    Queue<Integer> queue1;


    public MyStack_One() {
        queue1 = new LinkedList<>();

    }

    public void push(int x) {
        queue1.offer(x);
        int size = queue1.size();
        while (size-- > 1)
            queue1.offer(queue1.poll());
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
