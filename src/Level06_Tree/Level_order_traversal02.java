package Level06_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level_order_traversal02 {
    public static void main(String[] args) {
        List<Integer> levelOrder = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            levelOrder.add(0,i);
        }
        for (int i = 0; i < levelOrder.size(); i++) {
            System.out.println(levelOrder.get(i));
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder = new LinkedList<>();
        if (root == null) {
            return levelOrder;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            levelOrder.add(0,level);
        }
        return levelOrder;
    }
}
