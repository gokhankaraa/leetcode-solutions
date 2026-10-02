package hard.p0004_median_of_two_sorted_arrays;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] num3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, num3, 0, nums1.length);
        System.arraycopy(nums2, 0, num3, nums1.length, nums2.length);
        Arrays.sort(num3);

        int mid = num3.length / 2;
        if (num3.length % 2 == 0) {
            median = (num3[mid - 1] + num3[mid]) / 2.0;
        } else {
            median = num3[mid];
        }
        return median;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));    // 2.0
        System.out.println(s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})); // 2.5
    }
}
