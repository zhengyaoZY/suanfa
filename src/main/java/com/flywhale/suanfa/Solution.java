package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * 给出一个字符串数组S，找到其中所有的乱序字符串(Anagram)。
     * 如果一个字符串是乱序字符串，那么他存在一个字母集合相同，但顺序不同的字符串也在S中。
     */
    public List<String> anagrams(String[] strs) {
        List<String> returnStr = new ArrayList<>();
        //思路，使用遍历
        for(int i=0; i< strs.length; i++){
            String a = strs[i];
            char[] chars = a.toCharArray();
            List<String> addStr = new ArrayList<>();
            Boolean isExists = false;
            for(int j=i+1; j<strs.length;j++){
                String b = strs[j];
                char[] charsNext = b.toCharArray();
                //比较两个char[]是否相同
                Arrays.sort(chars);
                Arrays.sort(charsNext);
                if(Arrays.equals(chars, charsNext)){
                    isExists = true;
                    addStr.add(b);
                }
            }
            if(isExists){
                returnStr.add(a);
                returnStr.addAll(addStr);
            }
        }
        return returnStr;
    }

    public Boolean equals(char[] chars1, char[] chars2){
        if(chars1.length != chars2.length){
            return false;
        }else{
            //对比两个字符数组是否相等
            return Arrays.equals(chars1, chars2);
        }

    }

    public static void main(String[] args) {
        String[] s = new String[]{"lint", "intl", "inlt", "code"};
        Solution so = new Solution();
        List<String> strList  = so.anagrams(s);
        System.out.println(strList.toString());

    }

}
