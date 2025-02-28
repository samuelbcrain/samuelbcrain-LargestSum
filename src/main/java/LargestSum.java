
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        // if impossible to add, return min value
        if (nums.size() < 2) {
            return Integer.MIN_VALUE;
        }
        // set up vars
        int a = nums.get(0);
        int b = nums.get(1);
        int temp = 0;
        // put largest of first two in a, second largest in b
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        // go through list for largest two numbers
        for (int i = 2; i < nums.size(); i++) {
            // if find a number larger than current second largest, replace
            if (nums.get(i) > b) {
                b = nums.get(i);
                // when replace, also make sure largest in a and second largest in b
                if (a < b) {
                    temp = a;
                    a = b;
                    b = temp;
                }
            }
        }
        return a + b;// return sum of largest numbers
    }
}