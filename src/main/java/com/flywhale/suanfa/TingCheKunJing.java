package com.flywhale.suanfa;

import java.util.Arrays;

public class TingCheKunJing {

    /**
     * 停车场里停着许多汽车。 停车位是一条很长的直线，每米都有一个停车位。
     * 当前很多汽车停放，您想通过建造屋顶来遮雨挡雨。 要求至少有k辆车的车顶被车顶遮盖，要覆盖k辆车的车顶的最小长度是多少？
     * 该函数具有以下参数：
     *
     * cars：长度的整数数组，表示停放汽车的停车位
     * k：整数，表示必须被车顶遮盖的汽车数量
     */
    public static int ParkingDilemma(int[] cars, int k) {
        Long begintime = System.currentTimeMillis();
        //排序
        Arrays.sort(cars);
        //初始化定义的时候进行计算，可减少一次循环
        int finalMin = cars[k-1] - cars[0] +1;

        for(int i=1; i<=cars.length-k;i++){
            int minNum = cars[i+k-1] - cars[i] +1;
            if(minNum < finalMin){
                finalMin = minNum;
            }
        }
        return finalMin;

    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 3, 7};
        System.out.println(TingCheKunJing.ParkingDilemma(a, 3));;
    }

}
