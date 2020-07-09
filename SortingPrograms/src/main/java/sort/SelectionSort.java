package main.java.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] selectionArray = new int[]{15,17,16,12,13,10,7,9,8,5,6,4,1,2,3};
        doSelectionSort(selectionArray);
    }

    private static void doSelectionSort(int[] selectionArray) {
        if (null == selectionArray || selectionArray.length ==0)
            return;

        for (int i = 0; i < selectionArray.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < selectionArray.length; j++) {
                if (selectionArray[j] < selectionArray[min])
                    min = j;
            }
            swap(selectionArray, min, i);
        }

        print(selectionArray);
    }

    private static void print(int[] selectionArray) {
        for (int m = 0; m < selectionArray.length; m++) {
            System.out.print(selectionArray[m] + ", ");
        }
    }

    private static void swap(int[] selectionArray, int min, int i) {
        int temp = selectionArray[min];
        selectionArray[min] = selectionArray[i];
        selectionArray[i] = temp;
    }
}
