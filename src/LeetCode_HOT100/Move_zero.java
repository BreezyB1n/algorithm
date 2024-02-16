package LeetCode_HOT100;

public class Move_zero {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;


        while (right > left) {
            if (nums[left] == 0 && nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }



            if (nums[left] != 0) left++;
            if (nums[right] == 0) right--;
        }

    }
}
