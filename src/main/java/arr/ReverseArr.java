package arr;

import java.util.Arrays;

public class ReverseArr {
    public int[] reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        ReverseArr r = new ReverseArr();
        System.out.println(Arrays.toString(r.reverseArr(new int[]{1, 2, 3, 4, 5})));
    }
}
