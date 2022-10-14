package com.flywhale.suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符同构
 * 给定两个字符串 s 和 t ，确定它们是否是同构的。
 * 两个字符串是同构的如果 s 中的字符可以被替换得到 t。
 * 所有出现的字符必须用另一个字符代替，同时保留字符串的顺序。 没有两个字符可以映射到同一个字符，但一个字符可以映射到自己。
 * 可以a -> b , b-> c , 但是不能 a -> c, b-> c
 *
 * 你可以假定两个字符串 s 和 t 是一样长度的.
 *
 *
 */
public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {
        // write your code here
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Map<Character, Character> charMap = new HashMap<Character, Character>();
        for(int i = 0; i < sChars.length; i++){
            if(charMap.containsKey(tChars[i])){
                 if(charMap.get(tChars[i]) != sChars[i]){
                     return false;
                 }
            }else {
                if(charMap.containsValue(sChars[i])){
                    return false;
                }
                charMap.put(tChars[i], sChars[i]);
            }
        }
        return  true;

    }

    public static void main(String[] args) {
        String s = "a`%ii,VEZQc_BSU%ObO5<sX81B/bOw+CNUd#Uav*P!Ax!#>hh,k#b/|>4ixFQZl+l!?bJjakbQbGglEb<g>Hf81m@A9GIvbd]qh?y__t+E(Iyv7zUEfZF{81VaM-0u?]tG=_fFR/XJ=X{-,oRpxE9u*VNYlM";
        String t = "b`%ii-WE[Qc_BSV%OcO5<sX82B/cOw+CNVd#Vbv*P!Bx!#?hh-k#c/|?4ixFQ[l+l!?cJkbkcQcGhlEc<h?Hf82m@B9GIvcd]rh?y__t+E(Iyv7{VEf[F{82WbN/0u?]tG=_fFR/XJ=X{/-oRpxE9u*WNYlN";
        System.out.println(isIsomorphic(s, t));
    }

}
