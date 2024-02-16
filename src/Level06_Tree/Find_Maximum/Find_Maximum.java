package Level06_Tree.Find_Maximum;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Find_Maximum {
    public static void main(String[] args) {

    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root != null) {
            deque.add(root);
        }

        while (!deque.isEmpty()) {
            int size = deque.size();
            int maximum = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode curNode = deque.poll();
                maximum = Math.max(curNode.val, maximum);
                if (curNode.left != null) {
                    deque.add(curNode.left);
                }
                if (curNode.right != null) {
                    deque.add(curNode.right);
                }
            }
            res.add(maximum);
        }
        return res;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }