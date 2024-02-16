package Level03;

public class Array01 {
    public static void main(String[] args) {

    }

    /**
     *
     * @param arr
     * @param size 数组已存储的元素数量，从1开始编号
     * @param element 待插入元素
     * @return
     */
    public static int addByElementSequence(int[] arr, int size, int element) {
        if (size >= arr.length) {
            return -1;
        }

        int index = size;
        for (int i = 0; i < size; i++) {
            if (element < arr[i]) {
                index = i;
                break;
            }
        }

        for (int j = size; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[index] = element;
        return index;
    }

    public static int addByElementSequence_HighEfficiency(int[] arr, int size, int element) {
        if (size >= arr.length) {
//            // 如果数组已满，进行扩容（假设扩容一倍）
//            int[] newArr = new int[arr.length * 2];
//            System.arraycopy(arr, 0, newArr, 0, arr.length);
//            arr = newArr;
            return -1;
        }

        int index = size;
        // 从后向前遍历数组，一边移动元素一边对比查找插入位置
        for (int j = size - 1; j >= 0; j--) {
            if (element < arr[j]) {
                // 如果新元素小于当前元素，则当前元素向后移动
                arr[j + 1] = arr[j];
            } else {
                // 如果新元素大于等于当前元素，则找到插入位置
                index = j + 1;
                break;
            }
        }

        // 插入新元素到找到的位置
        arr[index] = element;

        // 返回新元素插入的位置
        return index;
    }


    public static int removeByelement(int arr[], int size, int key) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
        }
        return size;
    }


}
