package com.flywhale.suanfa;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给出一个代表网址 host 的字符串 base_url，和代表查询参数的数组 query_params，你需要返回带查询参数的完整 URL。
 * 查询参数由一些包含两个元素的数组组成，第一个元素代表参数，第二个元素代表该参数对应的值。
 * 现在需要你拼接两个部分得到完整的 URL。base_url 和查询参数字符串之间使用 ? 拼接，在查询参数的参数和值之间通过 = 拼接，各个查询参数之间使用 & 拼接。查询参数需要根据字典序排序。
 */
public class UrlBianMa {

    public String urlencode(String base_url, List<List<String>> query_params) {
        // write your code.
        //将list集合转化为map。
        HashMap<String, String> queryMap = new HashMap<>();
        List<String> paramList = new ArrayList<>();
        for (int i=0; i<query_params.size(); i++){
            queryMap.put(query_params.get(i).get(0),query_params.get(i).get(1));
            paramList.add(query_params.get(i).get(0));
        }
        Collections.sort(paramList);
        for(int i=0;i<paramList.size(); i++){
            if(i == 0){
                base_url += "?";
            } else if(i != paramList.size()){
                base_url += "&";
            }
            base_url += (paramList.get(i) + "=" + queryMap.get(paramList.get(i)));

        }
        return base_url;
    }


    public static void main(String[] args) {
        String a = "sl";
        String b = "tl";
        String c = "text";
        String d = "op";
        List<String> str = new ArrayList<>();
        str.add(a);
        str.add(b);
        str.add(c);
        str.add(d);
        Collections.sort(str);
        System.out.println(str.toString());
    }


}
