package com.flywhale.suanfa;

/**
 * 子集相关的问题
 */
public class Sub {

    /**
     * 给一整数 n, 我们需要求前n个自然数形成的集合的所有可能子集中所有元素的和。
     * n=3， {{1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}
     *
     * 通过找规律可以发现，每个数出现2^(n - 1)次。
     * @param n
     * @return
     */
    public int subSum(int n) {
        // write your code here
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum * (int)Math.pow(2, n - 1);
    }

}
