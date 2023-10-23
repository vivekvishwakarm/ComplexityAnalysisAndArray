import java.util.Scanner;

public class OptimizedPrefixSumMatrix {

    // prefix sum matrix
    public static void prefixSumMatrix(int [][] arr){
    int m = arr.length;
    int n = arr[0].length;

    // traversed the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i<m; i++)
        {
            for (int j = 1; j<n;j++)
            {
                arr[i][j] += arr[i][j-1];
            }
        }
    // traverse the array column-wise to calculate the column wire sum
        for (int j = 0; j<n; j++)
        {
            for (int i = 1; i < m; i++)
            {
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    //Sum Region method
    public static int sumRegion(int [][] arr, int r1, int c1, int r2, int c2)
    {
        int sum=0, up = 0, left = 0, repeated_region = 0, result = 0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];
        result = sum - up - left + repeated_region;
        return result;
    }

    public static void main(String[] args) {
        // find the optimized prefix sum approach


        Scanner sc = new Scanner(System.in);
        // Enter the number of rows of matrix
        int m = sc.nextInt();

        // Enter the number of column of matrix
        int n = sc.nextInt();

        // Enter the Element of matrix
        System.out.println("Enter the element of matrix: ");
        int arr[][] = new int[m][n];
        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of r1 coordinate");
        int r1 = sc.nextInt();

        System.out.println("Enter the value of c1 coordinate");
        int c1 = sc.nextInt();

        System.out.println("Enter the value of r2 coordinate");
        int r2 = sc.nextInt();

        System.out.println("Enter the value of c2 coordinate");
        int c2 = sc.nextInt();

        prefixSumMatrix(arr);

        int result = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of elements of given rectangle is: "+result);
    }
}
