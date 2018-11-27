package com.company;

public class Partition {
    public static int Partition(int[] arr, int left, int right)
    {
        int pivot = right;
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int index = Partition(arr, left, right);

            quickSort(arr, left, index -1);
            quickSort(arr, index+1, right);
        }

    }
}
