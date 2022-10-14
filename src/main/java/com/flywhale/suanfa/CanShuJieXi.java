package com.flywhale.suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 在命令行输入如下命令：
 *
 * xcopy /s c:\\ d:\\e，
 * 各个参数如下：
 * 参数1：命令字xcopy
 * 参数2：字符串/s
 * 参数3：字符串c:\\
 * 参数4: 字符串d:\\e
 * 请编写一个参数解析程序，实现将命令行各个参数解析出来。
 *
 *
 * 解析规则：
 * 1.参数分隔符为空格
 * 2.对于用""包含起来的参数，如果中间有空格，不能解析为多个参数。比如在命令行输入xcopy /s "C:\\program files" "d:\"时，参数仍然是4个，第3个参数应该是字符串C:\\program files，而不是C:\\program，注意输出参数时，需要将""去掉，引号不存在嵌套情况。
 * 3.参数不定长
 * 4.输入由用例保证，不会出现不符合要求的输入
 * 数据范围：字符串长度：1\le s\le 1000\1≤s≤1000
 * 进阶：时间复杂度：O(n)\O(n) ，空间复杂度：O(n)\O(n)
 */
public class CanShuJieXi {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        strSpilt(str);
        br.close();
    }

    public static void strSpilt(String str){
        ArrayList<String> returnList = new ArrayList<>();
        //开始时没有引号，可以截取
        boolean canSpilt = true;
        int index = 0;
        for(int i = 0; i < str.length(); i++){
            if('"' == str.charAt(i)){
                canSpilt = !canSpilt;
            }
            if(' ' == str.charAt(i)){
                if(canSpilt){
                    returnList.add(str.substring(index,i).replaceAll("\"", ""));
                    index = i+1;
                }
            }
            if(i == str.length() -1 && index-1 != i){
                returnList.add(str.substring(index).replaceAll("\"", ""));
            }
        }
        System.out.println(returnList.size());
        for (String s : returnList){
            System.out.println(s);
        }

    }

}
