package Level01.HomeWork01.first_Q6;

import java.util.Arrays;
import java.util.List;

public class Ex11_4 {
    public static void main(String[] args) {
//        List<Integer> list_1 = Arrays.asList(1, 1, 1, 2, 1);
//        System.out.println(isPartitionable(list_1));

        List<Integer> list_2 = Arrays.asList(2, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_2));
    }

    public static boolean isPartitionable(List<Integer> list) {
        int i = 0;
        int left = 0;
        int right = 0;

        return left == right;


    }
}
