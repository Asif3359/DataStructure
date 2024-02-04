package ArrayProblem;
import java.util.Arrays;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int array[] = {1, 4, 2, 2, 8, 9, 1, 3};

        int array2[] = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == array2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array2[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        int[] resultArray = Arrays.copyOf(array2, uniqueCount);
        System.out.println("Array with duplicates removed: " + Arrays.toString(resultArray));
    }
}
