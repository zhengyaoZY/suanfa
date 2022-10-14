package com.flywhale.suanfa;

import java.util.Locale;

public class Test {


    public static void main(String[] args) {
        //Test test = new Test();
        //System.out.println(test.alphabetConversion("a1B2c3D4"));
        //System.out.println(test.alphabetConversion2("1234"));
        System.out.println(3*0.3 == 0.6);
    }


    /**
     * 请编写代码，使用 String 类中的相关方法和 Character 类中的相关方法将字符串中所有的大写字母转换成小写字母，所有的小写字母转换成大写字母。
     * @param str
     * @return
     */
    public String alphabetConversion(String str) {
        // write your code here
        if(!str.matches(".*[a-zA-Z]+.*")){
            return str;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            String s = str.substring(i, i+1);
            if(s.matches("[a-z]")){
                s = s.toUpperCase(Locale.ROOT);
            }else if(s.matches("[A-Z]")) {
                s = s.toLowerCase(Locale.ROOT);
            }
            sb.append(s);
        }
        return sb.toString();
    }


    public String alphabetConversion2(String str) {
        // write your code here
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 'a') && (array[i] <= 'z')) {
                array[i] = Character.toUpperCase(array[i]);
            } else if ((array[i] >= 'A') && (array[i] <= 'Z')) {
                array[i] = Character.toLowerCase(array[i]);
            }
        }
        /*for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                array[i] = Character.toLowerCase(array[i]);
            } else if (Character.isLowerCase(array[i])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }*/

        String string = new String(array);

        return string;
    }
}
