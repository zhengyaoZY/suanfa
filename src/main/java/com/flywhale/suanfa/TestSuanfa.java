package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 算法考试
 * 高矮个子排队
 */
public class TestSuanfa {

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入的数据
        String str = scanner.nextLine();
        String[] ints = str.split(" ");
        int[] intList = new int[ints.length];
        for(int i = 0; i < ints.length; i++){
            try{
                intList[i] = Integer.valueOf(ints[i]);
            }catch (Exception e){
                System.out.println("[]");
                return;
            }
        }

        for(int i = 0;i < intList.length-1; i++){
            int temp = 0;
            //判断奇数位数
            if((intList[i] > intList[i+1] && i%2 != 0) || (intList[i] < intList[i+1] && i%2 == 0)){
                temp = intList[i+1];
                intList[i+1] = intList[i];
                intList[i] = temp;
            }
        }
        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i] + " ");
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Integer num = 0;


        for (int i = 0; i < str.length(); i++){
            String temp = str.substring(i,i+1);
            if(temp.matches("[0-9]") || "-".equals(str.substring(i,i+1))){
                if(i > 0 && "-".equals(str.substring(i,i+1)) && i != str.length()-1){

                    StringBuilder strBuild = new StringBuilder();
                    i++;
                    String tmp = str.substring(i,i+1);
                    if(tmp.matches("[0-9]")){
                        while(tmp.matches("[0-9]") && i < str.length()-1){
                            strBuild.append(tmp);
                            i++;
                            tmp = str.substring(i,i+1);
                        }
                        if(i == str.length()-1){
                            tmp = str.substring(i);
                            if(tmp.matches("[0-9]")){
                                strBuild.append(tmp);
                            }
                        }
                    }else {
                        continue;
                    }

                    num -= Integer.valueOf(strBuild.toString());




                }else {
                    num += Integer.valueOf(temp);
                }
            }
        }
        System.out.println(num);

    }



}
