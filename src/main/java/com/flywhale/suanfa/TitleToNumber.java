package com.flywhale.suanfa;

/**
 * 给定Excel工作表中显示的列名称，返回其对应的列号。
 */
public class TitleToNumber {

    public static int titleToNumber(String s) {
        // write your code here
        char[] chars = s.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i++){
            num *= 26;
            num += (chars[i] - 'A' + 1);
        }
        return  num;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

}
