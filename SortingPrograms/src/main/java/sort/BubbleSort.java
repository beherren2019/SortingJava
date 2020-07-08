package main.java.sort;


public class BubbleSort {
    public static void main(String[] args) {
        int[] sortableArray = new int[] {6,7,8,1,2,4,9,10,3};
        doBubbleSort(sortableArray);
    }

    private static void doBubbleSort(int[] sortableArray) {
        if (null == sortableArray || sortableArray.length == 0)
            return;

        for (int i = 0; i < sortableArray.length -1; i++) {
            for (int j =0; j < sortableArray.length - i - 1 ; j++) {
                if (sortableArray[j] > sortableArray[j+1]) {
                    swap(sortableArray, j, j+1);
                }
            }
        }
        printArray(sortableArray);
    }

    private static void printArray(int[] sortableArray) {
        for (int i = 0; i < sortableArray.length; i ++)
        {
            System.out.print(sortableArray[i] +", ");
        }
    }

    private static void swap(int[] sortableArray, int j, int i) {
        int temp = sortableArray[j];
        sortableArray[j] = sortableArray[i];
        sortableArray[i] = temp;
    }
}
