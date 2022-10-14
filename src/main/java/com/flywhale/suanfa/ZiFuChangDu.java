package com.flywhale.suanfa;

/**
 * 本题我们要编写代码去除字符串 str 中的空格，然后返回去除空格后的字符串长度。
 *
 * 在本题的 Solution.java 中定义了一个 getLength 方法，该方法有一个 String 类型的参数 str 代表需要进行操作的字符串，你需要去除这个字符串中的空格并获得去除空格后的字符串长度，最后返回这个字符串长度，返回值为 int 类型。
 */
public class ZiFuChangDu {

    public static void main(String[] args) {
        String str = " ad sfd";
        ZiFuChangDu.getLength(str);
    }

    /**
     * 获取字符中不包含空格的长度
     * @param str
     * @return
     */
    public static int getLength(String str){
        str = str.replaceAll(" ", "");
        System.out.println(str.length());
        return str.length();
    }

}
