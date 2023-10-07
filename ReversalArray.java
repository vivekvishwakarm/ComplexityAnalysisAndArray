import java.util.Scanner;

public class ReversalArray {
    public static void main(String[] args) {
        // Reverse the array element
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,34,56,43,22};
        int n = arr.length;
        for (int i=0; i<n/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
