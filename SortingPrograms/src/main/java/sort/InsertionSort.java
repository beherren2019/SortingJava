package main.java.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] insertArr = new int[] {10,9,8,5,7,6,4,2,1,3};
        doInsertionSort(insertArr);
    }

    private static void doInsertionSort(int[] insertArr) {
        if (null == insertArr || insertArr.length == 0)
            return;


        for (int i = 1; i < insertArr.length; i++) {
            int key = insertArr[i];
            int j = i - 1;

            while (j >= 0 && key < insertArr[j]) {
                insertArr[j+1] = insertArr[j];
                --j;
            }
            insertArr[j+1] = key;
        }
        print(insertArr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]+ ", ");
    }
}
