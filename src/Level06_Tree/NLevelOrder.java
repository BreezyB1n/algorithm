package Level06_Tree;

import java.util.*;

public class NLevelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> value = new ArrayList<>();
        Deque<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (!q.isEmpty()) {
            Deque<Node> next = new ArrayDeque<>();
            List<Integer> nd = new ArrayList<>();
            while (!q.isEmpty()) {
                Node cur = q.pollFirst();
                nd.add(cur.val);
                for(Node chd : cur.children) {
                    if (chd != null) {
                        next.add(chd);
                    }
                }
            }
            q = next;
            value.add(nd);
        }
    return value;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
