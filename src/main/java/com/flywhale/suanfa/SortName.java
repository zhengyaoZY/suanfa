package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 班级的花名册
 *
 * 所谓字典排序就是一种对于随机变量形成序列的排序方法。即按照字母顺序，或者数字小大顺序，由小到大的形成序列。
 * 现在有一份学生名单，我们将学生姓名存放在了 list 中，请您按照字典排序的方式对其进行排序。请在 Solution 类的 sortName() 方法中编写您的代码，并返回排序后的结果。
 */
public class SortName {

    public static List<String> sortName(List<String> list) {

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        return list;

    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Benson");
        strList.add("Clark");
        strList.add("Adrian");
        System.out.println(sortName(strList));
    }

}
