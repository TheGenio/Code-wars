import static java.lang.Math.max;


public class Solution {


    static int maxSum(TreeNode root) {
        return root == null ? 0 : sum(root);
    }
    static int sum(TreeNode root1) {
        if (root1 == null) return 0;
        if (root1.left == null && root1.right == null) {
            return root1.value;
        }
        if (root1.right == null){
            return root1.value + sum(root1.left);
        }else if (root1.left == null){
            return root1.value + sum(root1.right);
        }

        return root1.value + Math.max(sum(root1.left), sum(root1.right));
    }




}