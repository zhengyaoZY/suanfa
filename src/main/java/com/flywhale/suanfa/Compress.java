package com.flywhale.suanfa;

/**
 * 设计一种方法，通过给重复字符计数来进行基本的字符串压缩。
 *
 * 例如，字符串 aabcccccaaa 可压缩为 a2b1c5a3 。而如果压缩后的字符数不小于原始的字符数，则返回原始的字符串。
 */
public class Compress {

    public String compress(String originalString) {
        // write your code here
        if(originalString == null || originalString == ""){
            return originalString;
        }
        char[] chars = originalString.toCharArray();
        StringBuffer newStr = new StringBuffer();
        newStr.append(chars[0]);
        //计数
        int num = 1;
        for(int i =1; i<chars.length; i++){

            if(chars[i] != chars[i-1]){
                newStr.append(num);
                newStr.append(chars[i]);
                num = 1;
            }else{
                num ++;
            }
        }
        newStr.append(num);
        if(newStr.length() >= originalString.length()){
            return  originalString;
        }else {
            return String.valueOf(newStr);
        }
    }

    public static void main(String[] args) {
        Compress compress = new Compress();
        System.out.println(compress.compress("aabbcc"));
    }

}
