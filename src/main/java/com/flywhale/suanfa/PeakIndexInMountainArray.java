package com.flywhale.suanfa;

/**
 * 山形数组的顶峰坐标
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 */
public class PeakIndexInMountainArray {

    /**
     * 思路解析
     * 已知顶峰为整个数组最大的值。
     * 可以根据二分法快速查找
     * @param a
     * @return
     */
    public int peakIndexInMountainArray(int[] a) {
        // Write your code here
        // 下标
        int start = 0, end = a.length - 1;
        while(start + 1 < end){
            // 中间值下标
           int mid = start + (end - start) / 2;
           // 判断查找左分支还是右分支
           if(a[mid] > a[mid-1] && a[mid] > a[mid+1]) {
               return mid;
           }else if (a[mid] > a[mid-1]){
               start = mid;
           }else {
               end = mid;
           }
        }
        if (a[start] > a[start - 1] && a[start] > a[start + 1]) {
            return start;
        }
        else {
            return end;
        }
    }

}
