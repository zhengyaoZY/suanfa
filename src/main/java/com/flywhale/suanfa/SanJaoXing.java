package com.flywhale.suanfa;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定三个整数 a、b、c 代表三角形的三条边长，判断这三条边是否能组成一个三角形，当判断为是时，请通过 System.out.println 语句输出 Is a triangle，当判断为否时，请使用 System.out.println 语句输出 Not a triangle
 */
public class SanJaoXing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a+ c > b){
            System.out.println("Is a triangle");
        }else {
            System.out.println("Not a triangle");
        }
    }

}
