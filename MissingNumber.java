public class MissingNumber {
    public static void main(String[] args) {
        // Find the missing number in given array
        int arr[] = {1,2,4,5};
        int n = arr.length;
        // sum of natural number in array
        int sumNaturalNumber = ((n+1)*(n+2))/2;
        int sum = 0;
        for (int i =0; i<n; i++)
        {
            // sum of current array element
            sum += arr[i];
        }
        int missingElementInArray = sumNaturalNumber - sum;
        System.out.println("Missing element in array: "+missingElementInArray);

    }
}
