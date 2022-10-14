package com.flywhale.suanfa;

/**
 * 计算字符串中的单词数，其中一个单词定义为不含空格的连续字符串。
 */
public class CountSegments {

    public int countSegments(String s) {
        String matchs = ".*[ ]+.*";
        // write yout code here
        if(!s.matches(matchs) && s.length() > 0){
            return 1;
        }
        char[] strs = s.toCharArray();
        int count = 0;
        for(int i = 0; i < strs.length-1; i++){
            if(!String.valueOf(strs[i]).matches(matchs)){
                if(String.valueOf(strs[i+1]).matches(matchs)){
                    count ++;
                }
                if(i == strs.length - 2){
                    if(!String.valueOf(strs[i]).matches(matchs)){
                        count ++;
                    }
                }
            }
        }
        return count;
    }

}
