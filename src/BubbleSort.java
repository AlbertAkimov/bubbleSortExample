import java.util.Arrays;

/**
 * @Authot: Albert Akimov
 * @Date: 30.05.2021
 * @Description:
 */
public class BubbleSort {

    public static long countIterations = 0L;

    public static void bubbleSort(int[] array) {

        boolean isSorted = false;
        countIterations = 0L;

        while (!isSorted) {
            isSorted = true;

            for(int i = 1; i < array.length; i++) {

                if(array[i] < array[i - 1]) {
                    isSorted = false;
                    array[i - 1] = array[i - 1] ^ array[i];
                    array[i] = array[i - 1] ^ array[i];
                    array[i - 1] = array[i - 1] ^ array[i];
                }
            }

            countIterations++;
        }

    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
