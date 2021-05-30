/**
 * @Authot: Albert Akimov
 * @Date: 30.05.2021
 * @Description:
 */
public class Main {

    public static void main(String[] args) {

        int[] array = RandomUtil.getRandomArray(200000);
        System.out.println("Unsorted array: ");
        BubbleSort.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("Sorted array: ");
        BubbleSort.printArray(array);

        System.out.println("Numbers of iterations for sorting array is: " + BubbleSort.countIterations);
    }
}
