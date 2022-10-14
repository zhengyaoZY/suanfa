package com.flywhale.suanfa;

/**
 * 能否放置花
 * 设你有一个长花圃，其中有些地块已经被种植了，但是有些地块没有。但是，花不能够在相邻的地块下种植 - 他们会争夺水从而导致两者的死亡。
 * 给定一个花圃（用一个包含0和1的数组来表示，其中0代表空，1代表非空），和一个数字n，返回n朵新的花在这个花圃上以能否在不违反“无相邻花”的规则种植。
 */
public class CanPlaceFlowers {

    /**
     * 输入: flowerbed = [1,0,0,0,1], n = 1
     * 输出: True
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Write your code here
        int index = -1;
        int count = 0;
        if(flowerbed.length > 1){
            if(flowerbed[1] != 1 && flowerbed[0] != 1){
                count++;
                index = 0;
            }
            for (int i = 1; i < flowerbed.length-1; i++){
                if(flowerbed[i] == 1){
                    index = i;
                }
                if(flowerbed[i+1] != 1 && i-index > 1 ){
                    count++;
                    index = i;
                }
            }
            if(flowerbed.length-1-index > 1 && flowerbed[flowerbed.length-1] == 0){
                count++;
            }
        }else {
            if (flowerbed.length == 1 && flowerbed[0] == 0){
                count++;
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,1};
        canPlaceFlowers(flowerbed,2);
    }

    /**
     * 别人的解题思路
     * @param flowerbed
     * @param n
     */
    public boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int count = 0;
        int m = flowerbed.length;
        int prev = -1;
        for (int i = 0; i < m; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                if (count >= n) {
                    return true;
                }
                prev = i;
            }
        }
        if (prev < 0) {
            count += (m + 1) / 2;
        } else {
            count += (m - prev - 1) / 2;
        }
        return count >= n;
    }
}
