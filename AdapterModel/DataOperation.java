package AdapterModel;

public class DataOperation {
    private SortAdapter sortAdapter;
    private SearchAdapter searchAdapter;

    public void setSortAdapter(SortAdapter sortAdapter) {
        this.sortAdapter = sortAdapter;
    }

    public void setSearchAdapter(SearchAdapter searchAdapter) {
        this.searchAdapter = searchAdapter;
    }

    public void sort(int[] arr){
        int len = arr.length;
        sortAdapter.sort(arr,0,len-1);
    }

    public int search(int[] arr, int num){
        int len = arr.length;
        return searchAdapter.search(arr,num,0,len-1);
    }
}
