package org.example.sorts;

public class QuickSort {

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    void quickSort(int[] arr, int low, int high){
        if(low < high) {
            var pIndex = getP(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    int getP(int[] arr, int low, int high){
        int pivot = arr[low], i = low, j = high, temp = 0;
        while(i<j){
            while(arr[i] <= pivot && i <= high-1) i++;
            while(arr[j] > pivot && j >= low + 1)  j--;
            if(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
