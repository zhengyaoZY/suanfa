package com.flywhale.suanfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 唯一字符
 */
public class IsUnique {

    public static void main(String[] args) {
        //System.out.println(isUnique("abc"));
        //firstUniqChar("aabb");
        System.out.println(firstUniqChar2("aabc"));
    }

    /**
     * 实现一个算法确定字符串中的字符是否均唯一出现
     */
    public static boolean isUnique(String str) {
        // write your code here
        HashSet<String> set = new HashSet<>(str.length());
        for(int i = 0; i<str.length();i ++){
            set.add(str.substring(i,i+1));
        }
        return set.size() == str.length();
    }

    /**
     * 第一个只出现一次的字符
     * @return
     */
    public static char firstUniqChar(String str){
        for(int i = 0;i < str.length(); i++){
            if(str.lastIndexOf(str.charAt(i)) == i && str.indexOf(str.charAt(i)) == i){
                return str.charAt(i);
            }

        }
        return (char) -1;
    }

    /**
     * 第一个只出现一次的字符 算法优化
     * @param str
     * @return
     */
    public static char firstUniqChar2(String str){
        HashMap<Character, Object> charMap = new HashMap<Character, Object>();
        for (int i = 0;i < str.length(); i++){
            if(charMap.containsKey(str.charAt(i))){
                continue;
            }
            for (int j = str.length() -1; j >= i; j--){
                if(str.charAt(i) == str.charAt(j)){
                    if(i != j){
                        charMap.put(str.charAt(i), null);
                        break;
                    }else {
                        return str.charAt(i);
                    }
                }
            }
        }
        return (char) -1;
    }

}
