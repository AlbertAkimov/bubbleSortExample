import java.util.Arrays;

/**
 * @Authot: Albert Akimov
 * @Date: 30.05.2021
 * @Description:
 */
public class RandomUtil {

    public static int[] getRandomArray(int size) {
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }
}
