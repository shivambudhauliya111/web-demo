// Last updated: 16/03/2026, 15:30:09
1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { 
3        if (root == null || root == p || root == q) {
4            return root;
5        }
6        TreeNode left = lowestCommonAncestor(root.left, p, q);
7        TreeNode right = lowestCommonAncestor(root.right, p, q);
8        if (left != null && right != null) {
9            return root;
10        }
11        return (left != null) ? left : right;
12    }
13}