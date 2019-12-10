package practice.examples;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastPointer = nums1.length - 1;
        while (lastPointer >= 0) {
            if (m == 0 || n == 0) {
                break;
            }
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[lastPointer] = nums1[m - 1];
                m--;
            } else {
                nums1[lastPointer] = nums2[n - 1];
                n--;
            }
            lastPointer--;
        }
        if (m == 0) {
            while (n > 0) {
                nums1[lastPointer] = nums2[n - 1];
                n--;
                lastPointer--;
            }
        } else if (n == 0) {
            while (m > 0) {
                nums1[lastPointer] = nums1[m - 1];
                m--;
                lastPointer--;
            }
        }
        System.out.println(nums1);
    }
}
