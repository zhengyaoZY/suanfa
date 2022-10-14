package com.flywhale.suanfa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 入门的题
 */
public class RuMen {

    /**
     * 取近似值
     * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。
     */
    public void test(){
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println((int)(number + 0.5));
    }

    /**
     * 提取不重复的整数
     * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
     * 保证输入的整数最后一位不是 0 。
     */
    public void test2(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] chars= (num+"").toCharArray();
        String str ="";
        for(int i= chars.length-1; i>= 0;i--){
            if(!str.contains(chars[i]+"")){
                str +=chars[i];
            }
        }
        System.out.println(Integer.valueOf(str));
    }

    /**
     * 输入n个整数，输出其中最小的k个
     */
    public void test3(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<k;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    /**
     * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
     */
    public void test4(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();//接收数组长度
            int[] arr = new int[n];//创建数组

            for (int i = 0; i < n; i++) {//数组填入
                arr[i] = sc.nextInt();
            }

            int flag = sc.nextInt();//接收排序标识
            Arrays.sort(arr);//数组排序

            if (flag == 0) {//正序输出
                for(int i =0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else {//逆序输出
                for(int i = arr.length - 1; i >= 0; i--){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

}
