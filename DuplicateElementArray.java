public class DuplicateElementArray {
    public static void main(String[] args) {
        // Find duplicate element in array element
        int[] arr = {1,2,3,4,3};
        int n = arr.length;
        for (int i=0; i<n; i++)
        {
            for (int j = i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate element in array is: "+arr[i]);
                }
            }
        }
    }
}
