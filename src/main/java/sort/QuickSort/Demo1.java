package sort.QuickSort;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr={5,23,6,7,1,2,6,0};
        System.out.println((Arrays.toString(quickSort(arr,0,arr.length-1))));

    }
    public static int[] quickSort(int[] arr,int left,int right) {
        if(left < right) {
            int i = left + 1, j = right;
            int temp;
            while (i <= j) {
                if (arr[left] <= arr[j]) {
                    j--;
                } else if (arr[left] >= arr[i]) {
                    i++;
                } else {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (i == j) {
                    temp = arr[j];
                    arr[j] = arr[left];
                    arr[left] = temp;
                }
            }
            //这里必须得是i,不能是j,切记
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
        return arr;
    }
}
