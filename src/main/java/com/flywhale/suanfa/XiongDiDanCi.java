package com.flywhale.suanfa;

import java.util.*;

/**
 * 查找兄弟单词
 * 定义一个单词的“兄弟单词”为：交换该单词字母顺序（注：可以交换任意次），而不添加、删除、修改原有的字母就能生成的单词。
 * 兄弟单词要求和原来的单词不同。例如： ab 和 ba 是兄弟单词。 ab 和 ab 则不是兄弟单词。
 * 现在给定你 n 个单词，另外再给你一个单词 x ，让你寻找 x 的兄弟单词里，按字典序排列后的第 k 个单词是什么？
 * 注意：字典中可能有重复单词。
 */
public class XiongDiDanCi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String[] ss = scanner.nextLine().split(" ");
            Integer a = Integer.parseInt(ss[0]);
            String x = ss[ss.length-2];
            Integer k = Integer.parseInt(ss[ss.length-1]);
            List<String> list = new ArrayList<>();

            for (int i = 1; i <=a ; i++) {
                if (isBrother(x,ss[i])){
                    list.add(ss[i]);
                }
            }
            int size = list.size();
            System.out.println(size);
            if (size>=k){
                Collections.sort(list);
                System.out.println(list.get(k-1));
            }

        }
    }
    public static boolean isBrother(String x,String y){
        if (x.length()!=y.length()||y.equals(x)){
            return false;
        }
        char[] s = x.toCharArray();
        char[] j= y.toCharArray();
        Arrays.sort(s);
        Arrays.sort(j);
        return new String(s).equals(new String(j));

    }

}
