package Level03;

public class MergeArray {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int len1 = m - 1, len2 = n - 1;
        while (len1 >= 0 && len2 >= 0) {
            if (nums1[len1] <= nums2[len2]) {
                nums1[i--] = nums2[len2--];
            } else if (nums1[len1] > nums2[len2]) {
                nums1[i--] = nums1[len1--];
            }
        }

        //若其中一个数组还有值
        while (len1 != -1) {
            nums1[i--] = nums1[len1--];
        }
        while (len2 != -1) {
            nums2[i--] = nums2[len2--];
        }
    }

}
