import java.util.*;
public class LargestUnique {
    public void larger_unique_number() {
        int[] array = {2, 2, 2, 4, 5, 6, 8, 9, 3, 8, 9, 5, 7, 5, 7}; //Works for every input
        int beg = 0; //beginning of subarray
        int end = 3; //end of subarray
        int subArraySize = 3;
        int[] subArray;
        for (int value : array) {
            subArray = Arrays.copyOfRange(array, beg, end); //subarray method
            if (value == array[array.length - subArraySize + 2]) {
                continue;
            }
            System.out.print(Arrays.toString(subArray));
            System.out.println(" Has "+countDistinct(subArray,subArray.length)+" unique numbers.");
            beg++;
            end++;
        }
    }
    static int countDistinct(int arr[], int n)
    {
        int result = 1;
        // Pick all elements one by one
        for (int i = 1; i < n; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            // If not printed earlier,
            // then print it
            if (i == j)
                result++;
        }
        return result;
    }
}
