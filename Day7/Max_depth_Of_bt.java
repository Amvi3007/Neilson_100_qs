package Day7;

public class Max_depth_Of_bt {

static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

static class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);

        return Math.max(left, right);
    }
}

public class Main {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Solution sol = new Solution();

        int result = sol.maxDepth(root);

        System.out.println("Maximum Depth: " + result);
    }
}

}
