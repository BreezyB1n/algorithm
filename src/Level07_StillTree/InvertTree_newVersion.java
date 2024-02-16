package Level07_StillTree;

import java.util.Deque;
import java.util.LinkedList;

public class InvertTree_newVersion {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right = left;
            if (temp.left != null) {
                queue.push(temp.left);
            }
            if (temp.right != null) {
                queue.push(temp.right);
            }
        }
        return root;
    }
}
