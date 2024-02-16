package Level03;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        //slow初始位置
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (fast + 1 == nums.length || nums[fast] + 1 != nums[fast + 1]) {
                //将当前区间[slow, fast]写入列表
                StringBuilder sb = new StringBuilder();
                sb.append(nums[slow]);
                if (slow != fast) {
                    sb.append("->").append(nums[fast]);
                }
                res.add(sb.toString());
                slow = fast + 1;
            }
        }
        return res;
    }
}
