package AdapterModel;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        SortAdapter sortAdapter = new SortAdapter(new QuickSort());
        SearchAdapter searchAdapter = new SearchAdapter(new BinarySearch());

        DataOperation dataOperation = new DataOperation();
        dataOperation.setSearchAdapter(searchAdapter);
        dataOperation.setSortAdapter(sortAdapter);

        int[] array = {2,4,8,5,24,64,13,44,36,26,31,3,55};
        dataOperation.sort(array);
        System.out.println(Arrays.toString(array));
        int i = dataOperation.search(array,13);
        if(i != -1) System.out.println("元素查询成功，下标在"+i);
        else System.out.println("未查询到元素");
    }
}
