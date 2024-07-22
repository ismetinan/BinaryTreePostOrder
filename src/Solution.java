import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        search(list, root);
        return list;
    }
    private void search(List<Integer> list , TreeNode node) {
        if(node != null) {
            if (node.left != null) {
                search(list, node.left);
            }
  
            if (node.right != null) {
                search(list, node.right);
            }
            list.add(node.val);
        }

    } 
}