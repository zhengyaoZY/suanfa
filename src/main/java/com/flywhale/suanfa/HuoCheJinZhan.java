package com.flywhale.suanfa;

import java.util.*;

/**
 * 火车进站
 * 给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号，火车站只有一个方向进出，同时停靠在火车站的列车中，只有后进站的出站了，先进站的才能出站。
 * 要求输出所有火车出站的方案，以字典序排序输出。
 * 数据范围：1≤ n ≤10
 */
public class HuoCheJinZhan {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            //火车数
            int n=input.nextInt();
            //记录入站序列
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            //结果集
            List<List<Integer>> result=new ArrayList<>();
            //回溯完了，result就是结果
            huisu(result,new ArrayList<>(),arr,n,new Stack<Integer>(),0,0);
            //对result进行字典序排序：先转换为字符串数组再排序
            StringBuilder sb=new StringBuilder();
            List<String> result2=new ArrayList<>();
            for(List<Integer> list :result){
                sb=new StringBuilder();
                for(int i=0;i< list.size();i++){
                    sb.append(list.get(i));
                    if( i != list.size()-1){//不是最后一个,加空格
                        sb.append(" ");
                    }
                }
                result2.add(sb.toString());
            }
            Collections.sort(result2);
            for(String s:result2){
                System.out.println(s);
            }
        }
    }
    //result:结果集，temp：临时出车路径，arr:入站序列，n：火车数 stack：火车站 i:出栈序列位置 j：入站序列位置
    public static void huisu(List<List<Integer>> result, List<Integer> temp, int[] arr, int n, Stack<Integer> stack, int i, int j){
        //base case:全部出栈入栈完毕，则存入结果集
        if(i==n && j==n){
            result.add(new ArrayList<Integer>(temp));
            temp=new ArrayList<>();
            return ;
        }
        //选择进站（入栈序列不为空）:入栈序列不为空，就可以选择。选择之后递归，之后再撤销选择
        if(j != n){
            stack.push(arr[j]);
            huisu(result,temp,arr,n,stack,i,j+1);
            stack.pop();
        }
        //栈顶的元素出栈：也是可选的(栈不空就可以操作)
        if( !stack.isEmpty()){
            int x=stack.pop();
            temp.add(x);
            huisu(result,temp,arr,n,stack,i+1,j);
            temp.remove(temp.size()-1);//再去除最后一个
            stack.push(x);//再压进去
        }
    }

}
