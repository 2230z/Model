package AdapterModel;

public class QuickSort {
    public void quickSort(int[] array, int low, int high){
        if (low >= high) {
            return;
        }
        // 1. 指定基准值和左右指针记录位置
        int pivot = array[low];
        int l = low;
        int r = high;
        int temp = 0;
        // 2. 遍历条件，左右指针位置
        while (l < r) {
            // 2.1 右侧遍历
            while (l < r && array[r] >= pivot) {
                r--;
            }
            // 2.2 左侧遍历
            while (l < r && array[l] <= pivot) {
                l++;
            }
            // 2.3 l指针还在r指针左侧，尚未相遇
            if (l < r) {
                temp = array[l];
                array[l] = array[r];
                array[r] = temp;
            }
        }
        // 3. 当左右指针相遇，交换基准值位置
        array[low] = array[l];
        array[l] = pivot;
        // 4. 根据条件左侧递归遍历
        if (low < l) {
            quickSort(array, low, l - 1);
        }
        // 5. 根据条件右侧递归遍历
        if (r < high) {
            quickSort(array, r + 1, high);
        }

    }

}
