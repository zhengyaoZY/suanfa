package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路，这道题还是用了递归的方法。即每个节点都不断的调用parseTree本身这个方法往下进行递归，直到最下面。
 */
public class HouXuBianLi {
    List<Integer> returnList = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        parseTree(root);
        return returnList;
    }

    public void parseTree(TreeNode root){
        if(root == null){
            return;
        }
        parseTree(root.left);
        parseTree(root.right);
        returnList.add(root.val);
    }



}
