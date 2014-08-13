import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Find the last element of a list
 */
public class P01<T> {
    public static int last(int[] array) {
        if (array == null) return -1;
        return array[array.length - 1];
    }

    public static T last(T[] array) {
        if (array == null) return null;

        List<T> res = Arrays.asList(array);
        return res.get(res.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(last(arr));
    }
}
