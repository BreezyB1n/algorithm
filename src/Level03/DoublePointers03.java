package Level03;

public class DoublePointers03 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;

        for (left = 0; left <= right;) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
