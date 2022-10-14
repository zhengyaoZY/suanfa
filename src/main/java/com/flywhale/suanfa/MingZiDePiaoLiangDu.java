package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 给出一个字符串，该字符串仅由小写字母组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
 * 每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个不同字母拥有相同的“漂亮度”。字母忽略大小写。
 *
 * 给出多个字符串，计算每个字符串最大可能的“漂亮度”。
 */
public class MingZiDePiaoLiangDu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        int num = scanner.nextInt();
        for(int i = 0; i<num; i++){
            int[] chars = new int[128];
            String str = scanner.next();
            int begin = 26;
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                chars[str.charAt(j)]++;
            }
            Arrays.sort(chars);
            for(int j = chars.length-1; j >=0 && chars[j] > 0; j--){
                count += chars[j] * begin;
                begin--;
            }
            nums.add(count);
        }
        for(Integer f : nums){
            System.out.println(f);
        }
    }

}
