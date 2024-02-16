package HashAndQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举a
        for (int first = 0; first < n; ++first) {
            //去重，确保和上一次枚举的数不同
            //确保不会重复处理相同的元素。
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            // c对应的指针初始指向最右端
            int right = n - 1;
            int target = -nums[first];

            // 枚举b
            for (int left = first + 1; left < n; ++left) {
                // 确保和上一次枚举不同
                if (left > first + 1 && nums[left] == nums[left - 1]) {
                    continue;
                }

                //保证b指针在c指针的左侧
                while (left < right && nums[left] + nums[right] > target) {
                    --right;
                }

                if (left == right) {
                    break;
                }
                if (nums[left] + nums[right] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                }
            }
        }

        return ans;
    }
}
