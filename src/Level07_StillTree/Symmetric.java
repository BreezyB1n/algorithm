package Level07_StillTree;

public class Symmetric {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return check(root.left, root.right);
    }

    public boolean check (TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return check(p.left, q.right) && check(p.right, q.left);
    }
}
