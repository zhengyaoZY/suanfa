package com.flywhale.suanfa;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZiMuBianHuan {

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L', 'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< chars.length; i++){
            char n = list.get(25 - list.indexOf(chars[i]));
            sb.append(n);
        }
        System.out.println(sb.toString());
    }

}
