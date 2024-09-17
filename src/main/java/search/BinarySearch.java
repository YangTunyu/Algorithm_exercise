package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,6,8,9,12,56,96};
        int num=56;
        int result=binarySearch(num, arr);
        System.out.println(result);



        System.out.println();
    }
    private static int binarySearch(int num, int[] arr){
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==num){
                return mid;
            }
            if(arr[mid]>=num){
                j=mid-1;
            }else i=mid+1;
        }
        return -1;
    }
}
