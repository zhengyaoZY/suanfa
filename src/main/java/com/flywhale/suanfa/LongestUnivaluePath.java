package com.flywhale.suanfa;

/**
 * 最长的单一路径
 * 给定一颗二叉树，找到路径中每个节点具有相同值的最长路径的长度。 此路径可能会也可能不会通过根节点。
 */
public class LongestUnivaluePath {

    int ans;

    /**
     * 思路解析：递归调用
     *       4
     *      / \
     *     4   5
     *    /   / \
     *   4   5   5
     *  /   /
     * 5   5
     * 上面的最长路径应该为四个5连接3条边
     * 递归思想。
     * 在 int left = arrowLength(node.left); 这步时，会递归算出左边的最大长度，最第四层的节点开始倒推，到第一层节点，长度为2
     * 在 int right = arrowLength(node.right); 这步时，会递归算出右边的最大长度。
     *
     * 第三层：左分支5与三层节点5相等。arrowLeft = 1
     * 第二层：左分支5与第二层节点5相等。 arrowLeft = 1+1; arrowRight = 1 ; ans = 2+1
     * 第一层：左分支4与第二层4相等。arrowLeft = 1+1； arrowRight = 2，所以最大值为 ans = 2+1 = 3
     * @param root
     * @return
     */
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }


    public int arrowLength(TreeNode node){
        if (node == null) {
            return 0;
        }
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}
