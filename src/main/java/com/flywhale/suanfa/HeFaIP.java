package com.flywhale.suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IPV4地址可以用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此正号不需要出现），
 * 如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
 *
 * 现在需要你用程序来判断IP是否合法。
 */
public class HeFaIP {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strs = str.split("\\.");
        if(strs.length != 4){
            System.out.println("NO");
            return;
        }
        boolean flag = true;
        for (String s1 : strs) {
            try {

                int i = Integer.parseInt(s1);
                if(i < 0 || i > 255 || (s1.startsWith("0")&& s1.length() > 1) || !s1.matches("^[0-9]+$")){
                    flag = false;
                    break;
                }
            } catch (NumberFormatException err) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        br.close();
    }

}
