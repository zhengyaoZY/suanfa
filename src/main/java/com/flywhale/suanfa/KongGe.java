package com.flywhale.suanfa;

/**
 * 从句子中删除多余空格
 */
public class KongGe {

    public static String removeExtra(String s) {
        // write your code here
        String newS = s.trim();
        String[] strs = s.split(" ");
        char kongge = ' ';
        char[] chars = newS.toCharArray();
        StringBuilder returnStr = new StringBuilder();
        for(int i =0; i< chars.length; i++){
            if(!(chars[i] == kongge && chars[i+1] == kongge)){
                returnStr.append(chars[i]);
            }
        }
        return returnStr.toString();
    }

    public static String removeExtra2(String s) {
        // write your code here
        String[] strs = s.split(" ");
        StringBuilder returnStr = new StringBuilder();
        for(int i =0; i< strs.length; i++){
            if(strs[i] != ""){
                returnStr.append(strs[i]).append(" ");
            }
        }
        return returnStr.toString().trim();
    }

    public static void main(String[] args) {
        String a = "  low               ercase  ";
        System.out.println(KongGe.removeExtra2(a));
    }


}
