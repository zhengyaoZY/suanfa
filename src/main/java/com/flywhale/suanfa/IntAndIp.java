package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * 整数和ip地址的转换
 * 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
 * 一个长整数。
 */
public class IntAndIp {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String ip = sc.nextLine();
            long ipDeci = Long.parseLong(sc.nextLine());
            System.out.println(transferToIpDecimal(ip));
            System.out.println(transferToIpAddress(ipDeci));
        }
    }
    // ip转成10进制数
    public static long transferToIpDecimal(String ip) {
        String[] ips = ip.split("\\.");
        long res = 0;
        for (int i = ips.length - 1, n = 0; i >= 0; i--) {
            res += Integer.parseInt(ips[i]) * Math.pow(2, n);
            n += 8;
        }
        return res;
    }
    // 10进制数转成ip
    public static String transferToIpAddress(long ipDeci) {
        StringBuilder sb = new StringBuilder();
        long ipi = 0;
        while (ipDeci > 0) {
            ipi = ipDeci % (long) Math.pow(2, 8);
            ipDeci = ipDeci / (long) Math.pow(2, 8);
            if (sb.length() == 0) {
                sb = sb.append(ipi);
            } else {
                sb = new StringBuilder().append(ipi).append(".").append(sb);
            }
        }
        return sb.toString();
    }

}
