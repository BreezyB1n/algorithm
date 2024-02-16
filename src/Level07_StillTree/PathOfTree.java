package Level07_StillTree;

import java.util.ArrayList;
import java.util.List;

public class PathOfTree {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfc(root, "", res);
        return res;
    }

    void dfc(TreeNode root, String path, List<String> res) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            res.add(path + root.val);
            return;
        }
        dfc(root.left, path + root.val + "->", res);
        dfc(root.right, path + root.val + "->", res);
    }
}
