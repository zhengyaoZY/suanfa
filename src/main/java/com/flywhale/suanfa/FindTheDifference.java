package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定两个只包含小写字母的字符串 s 和 t 。
 *
 * 字符串 t 是由随机打乱字符顺序的字符串 s 在随机位置添加一个字符生成。
 */
public class FindTheDifference {

    public static char findTheDifference(String s, String t){
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);
        for (int i = 0; i < ss.length; i++){
            if(ss[i] != ts[i]){
                return ts[i];
            }
        }
        return ts[ts.length-1];

    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

}
