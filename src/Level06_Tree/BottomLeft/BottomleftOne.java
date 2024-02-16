//package Level06_Tree.BottomLeft;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class BottomleftOne {
//    public static void main(String[] args) {
//
//    }
//
//    public int findBottomLeftValue(TreeNode root) {
//        if (root.left == null && root.right == null) return root.val;
//
//        Queue<TreeNode> list = new LinkedList<>();
//        list.offer(root);
//        TreeNode node = new TreeNode(-1);
//        while (!list.isEmpty()) {
//            node = list.poll();
//            if (node.left != null) {
//                list.offer(node.left);
//            }
//            if (node.right != null) {
//                list.offer(node.right;
//            }
//        }
//        return node.val;
//    }
//}
