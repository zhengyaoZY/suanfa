package com.flywhale.suanfa;

import java.util.Arrays;

/**
 * 给一包含大写字母和整数(从 0 到 9)的字符串, 试写一函数返回有序的字母以及数字和.
 */
public class Rearrange {

    public String rearrange(String str) {
        // Write your code here
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int num = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < chars.length; i++){
            if(chars[i] >= '0' && chars[i] <= '9'){
                num += (chars[i] - '0');
            }else {
                stringBuilder.append(chars[i]);
            }
        }
        if(stringBuilder.length() != str.length()){
            return stringBuilder.append(num).toString();
        }else {
            return stringBuilder.toString();
        }
    }

}
