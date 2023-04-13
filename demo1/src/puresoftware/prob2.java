
/*
 Given a sorted array of integers, write a recursive function to perform binary search.
 */


package puresoftware;

public class prob2 {
    int binarySearch(int arr[], int a, int b, int c)
    {
        if (b >= a && a <= arr.length - 1) {
 
            int mid = a + (b - a) / 2;
            if (arr[mid] == c)
                return mid;
            if (arr[mid] > c)
                return binarySearch(arr, a, mid - 1, c);
            return binarySearch(arr, mid + 1, b, c);
        }
        return -1;
    }
    public static void main(String args[])
    {
    	prob2 ob = new prob2();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int c = 10;
        int result = ob.binarySearch(arr, 0, n - 1, c);
        if (result == -1)
            System.out.println("elem. not present");
        else
            System.out.println("elem. found at index "
                               + result);
    }
}
