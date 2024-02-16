package Level07_StillTree;

import java.util.*;

public class MaxDepth {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(7);
        set.add(18);
        set.add(0);
        System.out.println(set);

        Set<Integer> set4 = new HashSet<>();
        set4.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}));
        System.out.println(set4);
        Set<Integer> set5 = new HashSet<>();
        set5.addAll(Arrays.asList(new Integer[] {2, 5}));
        Set<Integer> setDifference = new HashSet<>(set4);
        setDifference.removeAll(set5);
        System.out.println("set4 \\ set5 = " + setDifference);
        setDifference.remove(1);
        System.out.println(setDifference);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public int maxDepth02(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        int ans = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}
