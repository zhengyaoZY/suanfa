package com.flywhale.suanfa.printNum;

/**
 * 给定一个数字 num 表示 new TestB() 的次数，请您计算执行 num 次 new TestB() 后 TestA.num 的值，并在 Solution 类的 printNum 方法中输出。
 */
public class Solution {

    public static void printNum(int num) {
        // write your code here
        for(int i=0;i<num;i++)
        {
            TestB test =new TestB();   //实例化对象时自动调用构造方法
        }
        System.out.println(TestB.num);
    }

    public static void printNum2(int num) {
        // write your code here
        if (num < 1){
            System.out.println(0);
        }else {
            System.out.println(4*num + 2);
        }
    }

    public static void main(String[] args) {
        printNum(3);
    }

}
