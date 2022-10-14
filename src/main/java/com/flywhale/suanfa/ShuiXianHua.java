package com.flywhale.suanfa;

public class ShuiXianHua {

    public static void main(String[] args) {
        for(int i=100; i< 999; i++){
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if((Math.pow(a,3) +Math.pow(b,3) + Math.pow(c,3)) == i){
                System.out.println(i);
            }
        }

    }

}
