package com.flywhale.suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数
 */
public class CharCount {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char[] chars = str.toCharArray();
        Character car = br.readLine().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            if(car.equals(chars[i])){
                count++;
            }
        }
        System.out.println(count);
    }

}
