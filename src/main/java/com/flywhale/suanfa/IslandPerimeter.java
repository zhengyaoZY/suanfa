package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一张用二维数组表示的网格地图，其中1表示陆地单元格，0表示水域单元格。
 * 网格地图中的单元格视为水平/垂直相连（斜向不相连）。
 * 这个网格地图四周完全被水域包围着，并且其中有且仅有一个岛（定义为一块或多块相连的陆地单元格）。
 * 这个岛不包含湖（定义为不和外围水域相连的水域单元格）。
 * 一个地图单元格是边长为1的一个正方形；网格地图是一个矩形，并且它的长和宽不超过100。你要做的是求出这个岛的周长。
 */
public class IslandPerimeter {



    /**
     * @param grid: a 2D array
     * @return: the perimeter of the island
     */
    public int islandPerimeter(int[][] grid) {
        // Write your code here

        //上，左都有相邻
        int DOUBLE_ADJACENT = 0;
        //有相邻的数据，周长+2
        int ADJACENT = 2;
        //没有相邻的数据，周长+4
        int NO_ADJACENT = 4;

        //周长
        int perimeter = 0;
        //上一组数组中1的位置
        List<Integer> indexBefore = new ArrayList<>();
        List<Integer> listTemp = new ArrayList<>();
        // 首先处理grid中当个数组的值
        for(int i = 0 ; i < grid.length; i++){
            int[] row = grid[i];
            if(row[0] == 1){
                if(indexBefore.size() == 0){
                    perimeter += NO_ADJACENT;
                }else {
                    if(indexBefore.contains(0)){
                        //如果上一组元素中0下标的位置是1。那么+2
                        perimeter += ADJACENT;
                    }else{
                        perimeter += NO_ADJACENT;
                    }
                }
                listTemp.add(0);
            }
            for(int j = 1; j < row.length; j++){
                if(row[j] == 1){
                    if (row[j-1] == 1){
                        if(indexBefore.contains(j)){
                            perimeter += DOUBLE_ADJACENT;
                        }else {
                            perimeter += ADJACENT;
                        }
                    }else {
                        if(indexBefore.contains(j)){
                            perimeter += ADJACENT;
                        }else {
                            perimeter += NO_ADJACENT;
                        }
                    }
                    listTemp.add(j);
                }
            }
            indexBefore = listTemp;
            listTemp = new ArrayList<>();
        }
        return perimeter;
    }

    public static void main(String[] args) {
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        int[][] ints = {{0,1,0,0},{1,1,1,0},{0,1,0,0}, {1,1,0,0}};
        islandPerimeter.islandPerimeter(ints);
    }

}
