package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * 翻转游戏：给定一个只包含两种字符的字符串：+和-。你可以将两个连续的“++”翻转成"--"，你需要翻转一次，并找到翻转后所有可能得到的结果。
 */
public class GeneratePossibleNextMoves {

    public List<String> generatePossibleNextMoves(String s) {
        // write your code here
        List<String> returnList = new ArrayList<>();
        char[] chars = s.toCharArray();
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == chars[i-1] && chars[i] == '+'){
                chars[i-1] = '-';
                chars[i] = chars[i-1];
                returnList.add(new String(chars));
                chars[i-1] = '+';
                chars[i] = chars[i-1];
            }
        }
        return returnList;
    }

}
