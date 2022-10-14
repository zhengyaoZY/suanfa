package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定非负索引k，其中k≤33，返回杨辉三角形的第k个索引行。
 * 索引从0开始
 */
public class YangHuiSanJiao {

    /**
     * @param rowIndex: a non-negative index
     * @return: the kth index row of the Pascal's triangle
     */
    public static List<Integer> getRow(int rowIndex) {
        // write your code here
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add( row.get(i - 1) * (rowIndex - i + 1) / i);
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(getRow(2));
    }

}
