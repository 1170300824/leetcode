import java.util.List;
import java.util.Stack;

public class question98 {
    public static void main(String[] args) {
        List<Integer> a = new Stack<Integer>();
    }

    class Solution {
        public boolean isValidBST(TreeNode root) {
            if (root==null){
                return true;
            }
            boolean result = false;
            result = isValidBST(root.left)&&isValidBST(root.right);
            if (root.left.val<=root.val && root.right.val>=root.val){
                result = true;
            }
            return result;
        }
    }
}
