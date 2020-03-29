import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestUnique {

    int[] subArray;
    public void largerUniqueNUmber() {

        int[] array = {2, 2, 2, 4, 5, 6, 8, 9, 3, 8, 9, 5, 7, 5, 7}; //Works for every input
        int beg = 0; //beginning of subarray
        int end = 3; //end of subarray
        int subArraySize = 3;

        ArrayList<Integer> list=new ArrayList<Integer>(); //Used for collecting number of unique digits for each subArray

        for (int value : array) {
            subArray = Arrays.copyOfRange(array, beg, end); //subArray function
            if (value == array[array.length - subArraySize + 2]) {
                continue;
            }

            System.out.print(Arrays.toString(subArray)); //Prints subArray
            System.out.println(" Has "+countDistinct(subArray,subArray.length)+" number of unique digits."); //Prints number of unique digits for each subArray

            list.add(countDistinct(subArray,subArray.length));
            beg++;
            end++;

        }
        System.out.println("Arraylist of unique digits per subArray: "+list);
        System.out.println(Collections.max(list)+" is the arrayList max value");

    }

    public int countDistinct(int arr[], int n) {
        int result = 1;

        // Pick all elements one by one
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier, then print it
            if (i == j)
                result++;
        }
        return result;
    }
}
