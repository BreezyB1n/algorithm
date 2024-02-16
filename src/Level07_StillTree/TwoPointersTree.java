package Level07_StillTree;

public class TwoPointersTree {
    public static void main(String[] args) {
        int n = 0;
        if (n == 0);
        System.out.println("good");
        double a = 2.5;

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
