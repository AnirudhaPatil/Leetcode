package org.anirudha.practice.leetcode.arrays;

import org.anirudha.practice.leetcode.arrays.utils.Utils;

/**
 *
 * 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class ArrayMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int num1Ptr = 0;
        int num2Ptr = 0;
        int len = len1 + len2;
        boolean isEven = Utils.isEven(len);
        int half = isEven ? (len / 2) + 1 : len / 2;
        int[] merged = new int[half+1];
        int mid = 0;
        for(int i = 0; i <= half ; i++) {
            if(num1Ptr <= i && num2Ptr <= i) {
                if ((nums1[i] < nums2[i])) {
                    merged[i] = nums1[i];
                    num1Ptr++;
                    continue;
                } else {
                    merged[i] = nums2[i];
                    num2Ptr++;
                    continue;
                }
            }

            if(num1Ptr >= i) {
                merged[i] = nums2[i];
                num2Ptr++;
                continue;
            }
            if(num2Ptr >= i) {
                merged[i] = nums1[i];
                num1Ptr++;
            }
        }
        return isEven ? (double)(merged[half - 1] + merged[half - 2]) / 2 : (double)merged[half-1];
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[]{2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
