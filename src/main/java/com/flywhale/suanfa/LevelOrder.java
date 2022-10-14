package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 */
public class LevelOrder {

    static class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) {
           label = x;
           neighbors = new ArrayList<UndirectedGraphNode>();
       }
       public void setNeighbors(List<UndirectedGraphNode> neighbors){
            this.neighbors = neighbors;
       }
   }

    public List<List<Integer>> levelOrder(UndirectedGraphNode root) {
        // write your code here
        List<List<Integer>> returnList = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Integer index = 1;
        recursionNode(root, index, map);
        while (map.containsKey(index)){
            returnList.add(map.get(index));
            index++;
        }
        return returnList;
    }

    public void recursionNode(UndirectedGraphNode root, Integer index, Map<Integer, List<Integer>> map){
        if(root == null){
            return;
        }

        int sonIndex = index;

        if(map.containsKey(sonIndex)){
            map.get(sonIndex).add(root.label);
        }else {
            List<Integer> list = new ArrayList<>();
            list.add(root.label);
            map.put(sonIndex, list);
        }
        List<UndirectedGraphNode> newNodes = root.neighbors;
        if(newNodes.size() > 0){
            sonIndex++;
            for(UndirectedGraphNode undirectedGraphNode: newNodes){
                recursionNode(undirectedGraphNode, sonIndex, map);
            }
        }

    }

    public static void main(String[] args) {
        LevelOrder levelOrder = new LevelOrder();
        UndirectedGraphNode undirectedGraphNode1 = new UndirectedGraphNode(1);
        UndirectedGraphNode undirectedGraphNode3 = new UndirectedGraphNode(3);
        UndirectedGraphNode undirectedGraphNode2 = new UndirectedGraphNode(2);
        UndirectedGraphNode undirectedGraphNode4 = new UndirectedGraphNode(4);
        List<UndirectedGraphNode> neighbors1 = new ArrayList<>();
        neighbors1.add(undirectedGraphNode3);
        neighbors1.add(undirectedGraphNode2);
        neighbors1.add(undirectedGraphNode4);
        undirectedGraphNode1.setNeighbors(neighbors1);
        UndirectedGraphNode undirectedGraphNode5 = new UndirectedGraphNode(5);
        UndirectedGraphNode undirectedGraphNode6 = new UndirectedGraphNode(6);
        List<UndirectedGraphNode> neighbors3 = new ArrayList<>();
        neighbors3.add(undirectedGraphNode5);
        neighbors3.add(undirectedGraphNode6);
        undirectedGraphNode3.setNeighbors(neighbors3);
        levelOrder.levelOrder(undirectedGraphNode1);
    }

}
