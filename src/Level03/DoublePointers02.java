package Level03;

public class DoublePointers02 {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr,3));
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;

        for (left = 0; left <= right; ) {
            if ((nums[left] == val) && (nums[right] != val)) {
                nums[left] = nums[right];
            }
            if (nums[left] != val) left++;
            if (nums[right] == val) right--;
        }
        return left;
    }
}
