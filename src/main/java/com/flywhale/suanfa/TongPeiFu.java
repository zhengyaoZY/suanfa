package com.flywhale.suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 通配符
 * 实现如下2个通配符：
 * *：匹配0个或以上的字符（注：能被*和?匹配的字符仅由英文字母和数字0到9组成，下同）
 * ？：匹配1个字符
 *
 * 注意：匹配时不区分大小写。
 *
 * 输入：
 * 通配符表达式；
 * 一组字符串。
 * 输出：
 *
 * 返回不区分大小写的匹配结果，匹配成功输出true，匹配失败输出false
 * 数据范围：字符串长度：1≤s≤100
 * 进阶：时间复杂度：O(n^2)，空间复杂度：O(n)
 */
public class TongPeiFu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().toLowerCase();
        String str2 = br.readLine().toLowerCase();
        isMatch(str1, str2);
        br.close();
    }

    public static void isMatch(String str1, String str2){
        char ppp[]=str1.toCharArray();
        char sss[]=str2.toCharArray();

        boolean dp[][]=new boolean[ppp.length+1][sss.length+1];
        dp[0][0]=true;
        for(int i=1;i<=ppp.length;i++){
            if(ppp[i-1]=='*'){
                dp[i][0]=true;
            }else{
                break;
            }

        }
        for(int i=1;i<=ppp.length;i++){
            for(int j=1;j<=sss.length;j++){
                if(ppp[i-1]==sss[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }
                if(ppp[i-1]=='?'&&((sss[j-1]>='a'&&sss[j-1]<='z')||(sss[j-1]>='0'&&sss[j-1]<='9'))){
                    dp[i][j]=dp[i-1][j-1];
                }else if(ppp[i-1]=='*'&&((sss[j-1]>='a'&&sss[j-1]<='z')||(sss[j-1]>='0'&&sss[j-1]<='9'))){
                    dp[i][j]=dp[i-1][j]|dp[i][j-1]|dp[i-1][j-1];
                }
                //System.out.print(dp[i][j]+"  ");
            }
            //System.out.print("\n");
        }
        System.out.println(dp[ppp.length][sss.length]);
    }

}
