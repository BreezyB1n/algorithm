package Level06_Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class level_order_traversal {
    public static void main(String[] args) {

    }
    List<Integer> simpleLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        // 把根节点放入到队列中，然后不断遍历队列
        queue.add(root);

        while (queue.size() > 0) {
            //获取当前队列长度，这个长度相当于当前这一层的节点个数
            TreeNode t = queue.remove();
            res.add(t.val);
            if (t.left != null) {
                queue.add(t.left);
            }
            if (t.right != null) {
                queue.add(t.right);
            }
        }
        return res;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        // 放入根节点到队列中，然后不断遍历
        queue.add(root);
        // 获取队列长度
        while (queue.size() > 0) {
            // 获取当前这一层的元素个数
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            // 将队列中的元素全拿出来（获取这一层节点），放到临时list中
            // 如果节点的左/右子树不为空，也放入队列中
            for (int i = 0; i < size; ++i) {
                TreeNode t = queue.remove();
                temp.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            // 此时temp就是当前层的全部元素，用List类型的tmp保存，假如最终结果集中
            res.add(temp);
        }
        return res;
    }
}
