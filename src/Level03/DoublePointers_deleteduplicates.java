package Level03;

public class DoublePointers_deleteduplicates {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int slow = 1;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
