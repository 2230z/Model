package AdapterModel;

public class SearchAdapter {
    private BinarySearch search;

    public SearchAdapter(BinarySearch search){
        this.search = search;
    }

    public int search(int[] arr,int num, int low, int high){
        return search.binarySearch(arr,num,low,high);
    }
}
