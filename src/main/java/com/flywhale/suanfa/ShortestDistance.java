package com.flywhale.suanfa;

/**
 * 给出一个单词列表和两个单词单词1,单词2，返回列表中这两个单词之间的最短距离。
 */
public class ShortestDistance {


    public int shortestDistance(String[] words, String word1, String word2) {
        // Write your code here
        //p1: word1 index
        //p2: word2 index
        //shortest: |p1-p2|
        int p1 = -1,p2 = -1,shortest = words.length;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                p1 = i;
            }
            if(words[i].equals(word2)){
                p2 = i;
            }
            if (p1 != -1 && p2 != -1) {
                shortest = Math.min(shortest,Math.abs(p1 - p2));
            }
        }
        return shortest;
    }

}
