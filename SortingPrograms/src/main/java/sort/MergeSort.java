package main.java.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[] {10,5, 9,2,8,3,7,4,6,1};
        doMergeSort(arr, 0, arr.length - 1);
        doPrint(arr);
    }

    private static void doPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", " );
        }
    }

    private static void doMerge(int[] arr, int f, int m, int l) {

        int len1 = m - f + 1;
        int len2 = l - m;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];



        for (int i = 0; i < len1; i++) {
            arr1[i] = arr[f + i];
        }

        for (int i = 0; i < len2; i++) {
            arr2[i] = arr[m+1+i];
        }

        int i = 0, j = 0, k = f;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            arr[k] = arr1[i];
            i++; k++;
        }

        while (j < len2) {
            arr[k] = arr2[j];
            j++; k++;
        }

    }

    private static void doMergeSort(int[] arr, int f, int l) {
        if (f < l) {

            int m = (f + l) / 2;

            doMergeSort(arr, f, m);
            doMergeSort(arr, m+1, l);

            doMerge(arr, f, m, l);
        }
    }
}
