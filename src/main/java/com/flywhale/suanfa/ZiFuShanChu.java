package com.flywhale.suanfa;

import java.util.*;

/**
 * 给出两个字符串 str 和 sub，你的任务是在 str 中完全删除那些在 sub 中存在的字符。
 * Your code ran too much time than we expected. Check your time complexity. Time limit exceeded usually caused by infinite loop if your time complexity is the best.
 */
public class ZiFuShanChu {

    public static String CharacterDeletion(String str, String sub) {
        // write your code here
        //char[] strChars = str.toCharArray();
        //第一次循环 去重
        char[] subChars = sub.toCharArray();
        Arrays.sort(subChars);
        List<Character> subList = new ArrayList<>();
        subList.add(subChars[0]);
        for(int i=1;i< subChars.length;i++){
            if(subChars[i] != subChars[i-1]){
                subList.add(subChars[i]);
            }
        }
        //第二次循环，删数
        for(Character c : subList){
            str = str.replace(String.valueOf(c), "");
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "They are students";
        String sub = "aeiou";
        System.out.println(ZiFuShanChu.CharacterDeletion(str, sub));

    }
}
