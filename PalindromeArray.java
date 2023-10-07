import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        //Find this array is palindrome array or not
        Scanner sc = new Scanner(System.in);

        //int arr[] = {1,2,3,2,1};
        int arr1[] = new int[6];
        System.out.print("Enter 6 Array element: ");
        for (int i = 0; i<arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int n = arr1.length;
        int flag = 0;
        for(int i = 0; i<n/2; i++)
        {
            if(arr1[i] != arr1[n-i-1])
            {
                flag = 1;
                System.out.println("Number is not Palindrome");
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Number is Palindrome");
        }
    }
}
