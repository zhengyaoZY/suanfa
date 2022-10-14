package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.List;

public class FeiBoNaQi {

    public int fibonacci(int n) {
        // write your code here
        List<Integer> fibonacciList = new ArrayList<>();
        Integer one = 0;
        Integer two = 1;
        fibonacciList.add(one);
        fibonacciList.add(two);
        for(int i = 2; i <n ;i ++){
            fibonacciList.add(fibonacciList.get(i-1) + fibonacciList.get(i-2) );
        }
        return fibonacciList.get(n-1);
    }

}
