package AdapterModel;


// 适配器
public class SortAdapter {
    private QuickSort sort;

    public SortAdapter(QuickSort sort){
        this.sort = sort;
    }

    public void sort(int[] arr,int low, int high){
        sort.quickSort(arr,low,high);
    }

}
