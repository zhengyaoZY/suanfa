package com.flywhale.suanfa;


import java.util.Scanner;

/**
 * 进制转换
 * 输入16进制，转换成10进制
 */
public class JinZhiZhuanHuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(Integer.parseInt(s.substring(2,s.length()),16));
        }
    }

}
