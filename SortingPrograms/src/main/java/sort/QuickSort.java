package main.java.sort;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = new int[] {10, 5, 9, 4, 8, 3, 7, 2, 1, 6};
        doQuickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
    }
    private static void doQuickSort(int[] arr, int l, int h) {
        if (l < h) {
            int piv = doPartition(arr, l, h);

            doQuickSort(arr, l, piv -1);
            doQuickSort(arr, piv + 1, h);
        }
    }

    private static int doPartition(int[] arr, int l, int h) {
        int piv = arr[h];
        int i = (l - 1);

        for (int j = l; j < h; j++) {
            if (arr[j] <= piv) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[h];
        arr[h] = arr[i + 1];
        arr[i + 1] = temp;

        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
